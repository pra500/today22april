svg notes:


//parent - name()
//child - local-name()


//*[name()='svg']//*[local-name()='img' and @id='abcfdv123']


//*[name()='svg']//*[local-name()='path' and @fill-rule='evenodd']



//speed work 15 jan:
-ve testing in api learn




    

for executing testng.xml on console:
mvn clean test "-Dsurefire.suiteXmlFiles=src/test/resources/testng.xml"  -  if testng.xml in resouces fldr
mvn clean test "-Dsurefire.suiteXmlFiles=testng.xml"  - if testng.xml in project path

    





//div[starts-with(@class, 'cmp-container')]









rough:
//*[local-name()='svg' and @stroke-linecap='round']//*[local-name()='path']




xpath remember: img take @alt






svg element:

<svg>              //*[local-name()='svg']
<path>             //*[local-name()='svg']//*[local-name()='path']
<rect>             //*[local-name()='svg']//*[local-name()='rect']
<circle>           //*[local-name()='svg']//*[local-name()='circle']
<text>             //*[local-name()='svg']//*[local-name()='text']
























