import models.*;

import javax.xml.bind.*;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: arun
 * Date: 5/9/12
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;

    public static void main(String ar[]) throws JAXBException, FileNotFoundException, XMLStreamException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost/icecat","root","123456");
        statement=connect.createStatement();




        XMLInputFactory xif = XMLInputFactory.newInstance();
        XMLStreamReader xsr = xif.createXMLStreamReader(new FileReader("files.index.xml.1"));
        System.out.println(xsr.nextTag());
        JAXBContext context = JAXBContext.newInstance(File.class);
        Unmarshaller um = context.createUnmarshaller();
        File f;
        String buf ="";


    while(xsr.nextTag() == XMLStreamConstants.START_ELEMENT){
            try{
                f = (File) (um.unmarshal(xsr));
                preparedStatement=connect.prepareStatement("INSERT INTO files_index_xml VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                try{
                    for (CountryMarkets.CountryMarket countryMarket : f.getCountryMarkets().getCountryMarket()) {
                        buf= buf+countryMarket.getValue()+"-";
                    }
                }catch (NullPointerException e){
                    buf="";
                }
                preparedStatement.setString(1,buf);
                try{
                for (Distributor distributor : f.getDistributors().getDistributor()) {
                        buf=buf+distributor.getCountry()+"-";
                    }
                }
                catch(NullPointerException e){
                    buf="";
                }
                preparedStatement.setString(2,buf);
                try{
                    for (EANUPCS.EANUPC eanupc : f.getEANUPCS().getEANUPC()) {
                        buf=buf+eanupc.getValue()+"-";
                    }
                }
                catch(NullPointerException e){
                    buf="";
                }
                preparedStatement.setString(3,buf);
                try{
                    for (File.MProdID mProdID : f.getMProdID()) {
                        buf=buf+mProdID.getValue()+"-";
                   }
                }catch(NullPointerException e){
                     buf="";
                }
                preparedStatement.setString(4,buf);
                preparedStatement.setString(5,f.getPath());
                preparedStatement.setString(6,f.getProductID().toString());
                preparedStatement.setString(7,f.getUpdated());
                preparedStatement.setString(8,f.getDateAdded());
                preparedStatement.setString(9,f.getQuality());
                preparedStatement.setString(10,f.getSupplierId().toString());
                preparedStatement.setString(11,f.getProdID());
                preparedStatement.setString(12,f.getCatid().toString());
                preparedStatement.setString(13,f.isOnMarket()? "true":"false");
                try{
                    preparedStatement.setString(14, f.getStock().toString());
                }catch (Exception e){
                    preparedStatement.setString(14, "");
                }
                preparedStatement.setString(15,f.getModelName());
                preparedStatement.setString(16,f.getProductView().toString());
                preparedStatement.setString(17,f.getHighPic());
                preparedStatement.setString(18,f.getHighPicSize().toString());
                preparedStatement.setString(19,f.getHighPicWidth().toString());
                preparedStatement.setString(20,f.getHighPicHeight().toString());
                //System.out.println(preparedStatement.toString());
                preparedStatement.executeUpdate();
            }catch (UnmarshalException e){
                System.out.println("skipping"+e);
            }
        }
    }




}
