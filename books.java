Connextion conn = DriverManager.getConnection(connectionURL,"root",<passwordhere>");
int bid = 102;
String bookTitle ="Sql Essentials";
String author = "Jerry"
int price = 295;

String insertQuery= "insert into books values(101,'jdk by Wrox','ivor horton",750);

Statment stm = conn.createStatment();
stm .close();

System.out.println("Connection Established");
conn.close;
}
catch (Exception e){
e.printStackTrace();
}
}
}
