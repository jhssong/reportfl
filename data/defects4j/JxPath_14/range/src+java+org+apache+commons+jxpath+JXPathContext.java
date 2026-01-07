{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/JXPathContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContext",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 382,
      "end_line": 881,
      "comment": "\n * JXPathContext  provides APIs for the traversal of graphs of JavaBeans using\n * the XPath syntax. Using JXPathContext, you can read and write properties of\n * JavaBeans, arrays, collections and maps. JXPathContext uses JavaBeans\n * introspection to enumerate and access JavaBeans properties.\n * \u003cp\u003e\n * JXPathContext  allows alternative implementations. This is why instead of\n * allocating JXPathContext directly, you should call a static\n * \u003ccode\u003enewContext\u003c/code\u003e method.  This method will utilize the\n * JXPathContextFactory API to locate a suitable implementation of JXPath.\n * Bundled with JXPath comes a default implementation called Reference\n * Implementation.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eJXPath Interprets XPath Syntax on Java Object Graphs\u003c/h2\u003e\n *\n * JXPath uses an intuitive interpretation of the xpath syntax in the context\n * of Java object graphs. Here are some examples:\n *\n * \u003ch3\u003eExample 1: JavaBean Property Access\u003c/h3\u003e\n *\n * JXPath can be used to access properties of a JavaBean.\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class Employee {\n *    public String getFirstName(){\n *       ...\n *    }\n * }\n *\n * Employee emp \u003d new Employee();\n * ...\n *\n * JXPathContext context \u003d JXPathContext.newContext(emp);\n * String fName \u003d (String)context.getValue(\"firstName\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * In  this example, we are using JXPath to access a property of the\n * \u003ccode\u003eemp\u003c/code\u003e bean. In this simple case the invocation of JXPath is\n * equivalent to invocation of getFirstName() on the bean.\n *\n * \u003ch3\u003eExample 2: Nested Bean Property Access\u003c/h3\u003e\n * JXPath can traverse object graphs:\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class Employee {\n *    public Address getHomeAddress(){\n *       ...\n *    }\n * }\n * public class Address {\n *    public String getStreetNumber(){\n *       ...\n *    }\n * }\n *\n * Employee emp \u003d new Employee();\n * ...\n *\n * JXPathContext context \u003d JXPathContext.newContext(emp);\n * String sNumber \u003d (String)context.getValue(\"homeAddress/streetNumber\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * In this case XPath is used to access a property of a nested bean.\n * \u003cp\u003e\n * A property identified by the xpath does not have to be a \"leaf\" property.\n * For instance, we can extract the whole Address object in above example:\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n *    Address addr \u003d (Address)context.getValue(\"homeAddress\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n * \u003c/p\u003e\n *\n * \u003ch3\u003eExample 3: Collection Subscripts\u003c/h3\u003e\n * JXPath can extract elements from arrays and collections.\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class Integers {\n *    public int[] getNumbers(){\n *       ...\n *    }\n * }\n *\n * Integers ints \u003d new Integers();\n * ...\n *\n * JXPathContext context \u003d JXPathContext.newContext(ints);\n * Integer thirdInt \u003d (Integer)context.getValue(\"numbers[3]\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n * A  collection can be an arbitrary array or an instance of java.util.\n * Collection.\n * \u003cp\u003e\n * Note: in XPath the first element of a collection has index 1, not 0.\u003cbr\u003e\n *\n * \u003ch3\u003eExample 4: Map Element Access\u003c/h3\u003e\n *\n * JXPath supports maps. To get a value use its key.\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class Employee {\n *    public Map getAddresses(){\n *       return addressMap;\n *    }\n *\n *    public void addAddress(String key, Address address){\n *       addressMap.put(key, address);\n *    }\n *    ...\n * }\n *\n * Employee emp \u003d new Employee();\n * emp.addAddress(\"home\", new Address(...));\n * emp.addAddress(\"office\", new Address(...));\n * ...\n *\n * JXPathContext context \u003d JXPathContext.newContext(emp);\n * String homeZipCode \u003d (String)context.getValue(\"addresses/home/zipCode\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * Often you will need to use the alternative syntax for accessing Map\n * elements:\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * String homeZipCode \u003d \n *     (String) context.getValue(\"addresses[@name\u003d\u0027home\u0027]/zipCode\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * In this case, the key can be an expression, e.g. a variable.\u003cbr\u003e\n *\n * Note: At this point JXPath only supports Maps that use strings for keys.\u003cbr\u003e\n * Note: JXPath supports the extended notion of Map: any object with\n *       dynamic properties can be handled by JXPath provided that its\n *       class is registered with the {@link JXPathIntrospector}.\n *\n * \u003ch3\u003eExample 5: Retrieving Multiple Results\u003c/h3\u003e\n *\n * JXPath can retrieve multiple objects from a graph. Note that the method\n * called in this case is not \u003ccode\u003egetValue\u003c/code\u003e, but \u003ccode\u003eiterate\u003c/code\u003e.\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class Author {\n *    public Book[] getBooks(){\n *       ...\n *    }\n * }\n *\n * Author auth \u003d new Author();\n * ...\n *\n * JXPathContext context \u003d JXPathContext.newContext(auth);\n * Iterator threeBooks \u003d context.iterate(\"books[position() \u0026lt; 4]\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * This returns a list of at most three books from the array of all books\n * written by the author.\n *\n * \u003ch3\u003eExample 6: Setting Properties\u003c/h3\u003e\n * JXPath can be used to modify property values.\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class Employee {\n *    public Address getAddress() {\n *       ...\n *    }\n *\n *    public void setAddress(Address address) {\n *       ...\n *    }\n * }\n *\n * Employee emp \u003d new Employee();\n * Address addr \u003d new Address();\n * ...\n *\n * JXPathContext context \u003d JXPathContext.newContext(emp);\n * context.setValue(\"address\", addr);\n * context.setValue(\"address/zipCode\", \"90190\");\n *\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * \u003ch3\u003eExample 7: Creating objects\u003c/h3\u003e\n * JXPath  can be used to create new objects. First, create a subclass of {@link\n * AbstractFactory AbstractFactory} and install it on the JXPathContext. Then\n * call {@link JXPathContext#createPath createPathAndSetValue()} instead of\n * \"setValue\". JXPathContext will invoke your AbstractFactory when it discovers\n * that an intermediate node of the path is \u003cb\u003enull\u003c/b\u003e.  It will not override\n * existing nodes.\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class AddressFactory extends AbstractFactory {\n *    public boolean createObject(JXPathContext context, \n *               Pointer pointer, Object parent, String name, int index){\n *     if ((parent instanceof Employee) \u0026amp;\u0026amp; name.equals(\"address\"){\n *       ((Employee)parent).setAddress(new Address());\n *       return true;\n *     }\n *     return false;\n *   }\n * }\n *\n * JXPathContext context \u003d JXPathContext.newContext(emp);\n * context.setFactory(new AddressFactory());\n * context.createPathAndSetValue(\"address/zipCode\", \"90190\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * \u003ch3\u003eExample 8: Using Variables\u003c/h3\u003e\n * JXPath supports the notion of variables. The XPath syntax for accessing\n * variables is \u003ci\u003e\"$varName\"\u003c/i\u003e.\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class Author {\n *    public Book[] getBooks(){\n *       ...\n *    }\n * }\n *\n * Author auth \u003d new Author();\n * ...\n *\n * JXPathContext context \u003d JXPathContext.newContext(auth);\n * context.getVariables().declareVariable(\"index\", new Integer(2));\n *\n * Book secondBook \u003d (Book)context.getValue(\"books[$index]\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * You can also set variables using JXPath:\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * context.setValue(\"$index\", new Integer(3));\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * Note: you can only \u003ci\u003echange\u003c/i\u003e the value of an existing variable this\n * way, you cannot \u003ci\u003edefine\u003c/i\u003e a new variable.\n *\n * \u003cp\u003e\n * When a variable contains a JavaBean or a collection, you can\n * traverse the bean or collection as well:\n * \u003cpre\u003e\u003cblockquote\u003e\n * ...\n * context.getVariables().declareVariable(\"book\", myBook);\n * String title \u003d (String)context.getValue(\"$book/title);\n *\n * Book array[] \u003d new Book[]{...};\n *\n * context.getVariables().declareVariable(\"books\", array);\n *\n * String title \u003d (String)context.getValue(\"$books[2]/title);\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * \u003ch3\u003eExample 9: Using Nested Contexts\u003c/h3\u003e\n * If  you need to use the same set of variable while interpreting XPaths with\n * different beans, it makes sense to put the variables in a separate context\n * and specify that context as a parent context every time you allocate a new\n * JXPathContext for a JavaBean.\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * JXPathContext varContext \u003d JXPathContext.newContext(null);\n * varContext.getVariables().declareVariable(\"title\", \"Java\");\n *\n * JXPathContext context \u003d JXPathContext.newContext(varContext, auth);\n *\n * Iterator javaBooks \u003d context.iterate(\"books[title \u003d $title]\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * \u003ch3\u003eUsing Custom Variable Pools\u003c/h3\u003e\n * By default, JXPathContext creates a HashMap of variables. However,\n * you can substitute a custom implementation of the Variables\n * interface to make JXPath work with an alternative source of variables.\n * For example, you can define implementations of Variables that\n * cover a servlet context, HTTP request or any similar structure.\n *\n * \u003ch3\u003eExample 10: Using Standard Extension Functions\u003c/h3\u003e\n * Using the standard extension functions, you can call methods on objects,\n * static methods on classes and create objects using any constructor.\n * The class names should be fully qualified.\n * \u003cp\u003e\n * Here\u0027s how you can create new objects:\n * \u003cpre\u003e\u003cblockquote\u003e\n * Book book \u003d \n *    (Book) context.getValue(\n *         \"org.apache.commons.jxpath.example.Book.new (\u0027John Updike\u0027)\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * Here\u0027s how you can call static methods:\n * \u003cpre\u003e\u003cblockquote\u003e\n *   Book book \u003d \n *    (Book) context.getValue( \n *       \"org. apache.commons.jxpath.example.Book.getBestBook(\u0027John Updike\u0027)\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * Here\u0027s how you can call regular methods:\n * \u003cpre\u003e\u003cblockquote\u003e\n * String firstName \u003d (String)context.getValue(\"getAuthorsFirstName($book)\");\n * \u003c/blockquote\u003e\u003c/pre\u003e\n * As you can see, the target of the method is specified as the first parameter\n * of the function.\n *\n * \u003ch3\u003eExample 11: Using Custom Extension Functions\u003c/h3\u003e\n * Collections of custom extension functions can be implemented\n * as {@link Functions Functions} objects or as Java classes, whose methods\n * become extenstion functions.\n * \u003cp\u003e\n * Let\u0027s say the following class implements various formatting operations:\n * \u003cpre\u003e\u003cblockquote\u003e\n * public class Formats {\n *    public static String date(Date d, String pattern){\n *        return new SimpleDateFormat(pattern).format(d);\n *    }\n *    ...\n * }\n * \u003c/blockquote\u003e\u003c/pre\u003e\n *\n * We can register this class with a JXPathContext:\n *\n * \u003cpre\u003e\u003cblockquote\u003e\n * context.setFunctions(new ClassFunctions(Formats.class, \"format\"));\n * ...\n *\n * context.getVariables().declareVariable(\"today\", new Date());\n * String today \u003d (String)context.getValue(\"format:date($today, \u0027MM/dd/yyyy\u0027)\");\n *\n * \u003c/blockquote\u003e\u003c/pre\u003e\n * You can also register whole packages of Java classes using PackageFunctions.\n * \u003cp\u003e\n * Also, see {@link FunctionLibrary FunctionLibrary}, which is a class\n * that allows you to register multiple sets of extension functions with\n * the same JXPathContext.\n *\n * \u003ch2\u003eConfiguring JXPath\u003c/h2\u003e\n *\n * JXPath uses JavaBeans introspection to discover properties of JavaBeans.\n * You can provide alternative property lists by supplying\n * custom JXPathBeanInfo classes (see {@link JXPathBeanInfo JXPathBeanInfo}).\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n * \u003cul\u003e\n * \u003cli\u003e JXPath does not support DOM attributes for non-DOM objects. Even though\n * XPaths like \"para[@type\u003d\u0027warning\u0027]\" are legitimate, they will always produce\n * empty results. The only attribute supported for JavaBeans is \"name\".  The\n * XPath \"foo/bar\" is equivalent to \"foo[@name\u003d\u0027bar\u0027]\".\n * \u003c/ul\u003e\n *\n * See  \u003ca href\u003d\"http://www.w3schools.com/xpath\"\u003eXPath Tutorial by\n * W3Schools\u003c/a\u003e\u003cbr\u003e. Also see \u003ca href\u003d\"http://www.w3.org/TR/xpath\"\u003eXML Path\n * Language (XPath) Version 1.0\u003c/a\u003e\u003cbr\u003e\u003cbr\u003e \n * \n * You will also find more information and examples in\n * \u003ca href\u003d\"http://commons.apache.org/jxpath/users-guide.html\"\u003e\n * JXPath User\u0027s Guide\u003c/a\u003e\n *\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parentContext"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextBean"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vars"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functions"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lenientSet"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lenient"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idManager"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyManager"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decimalFormats"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextFactory"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compilationContext"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GENERIC_FUNCTIONS"
      ],
      "begin_line": 398,
      "end_line": 399,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.newContext(java.lang.Object)",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Creates a new JXPathContext with the specified object as the root node.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.newContext(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 413,
      "end_line": 418,
      "comment": "\n     * Creates a new JXPathContext with the specified bean as the root node and\n     * the specified parent context. Variables defined in a parent context can\n     * be referenced in XPaths passed to the child context.\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getContextFactory()",
      "begin_line": 423,
      "end_line": 428,
      "comment": "\n     * Acquires a context factory and caches it. \n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathContext.JXPathContext(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\n     * This  constructor should remain protected - it is to be overridden by\n     * subclasses, but never explicitly invoked by clients.\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 43)",
        "(line 436,col 9)-(line 436,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getParentContext()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * Returns the parent context of this context or null.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getContextBean()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Returns the JavaBean associated with this context.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getContextPointer()",
      "begin_line": 456,
      "end_line": 456,
      "comment": "\n     * Returns a Pointer for the context bean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getRelativeContext(org.apache.commons.jxpath.Pointer)",
      "begin_line": 464,
      "end_line": 464,
      "comment": "\n     * Returns a JXPathContext that is relative to the current JXPathContext.\n     * The supplied pointer becomes the context pointer of the new context.\n     * The relative context inherits variables, extension functions, locale etc\n     * from the parent context.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setVariables(org.apache.commons.jxpath.Variables)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n     * Installs a custom implementation of the Variables interface.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getVariables()",
      "begin_line": 479,
      "end_line": 484,
      "comment": "\n     * Returns the variable pool associated with the context. If no such\n     * pool was specified with the \u003ccode\u003esetVariables()\u003c/code\u003e method,\n     * returns the default implementation of Variables,\n     * {@link BasicVariables BasicVariables}.\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setFunctions(org.apache.commons.jxpath.Functions)",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\n     * Install a library of extension functions.\n     *\n     * @see FunctionLibrary\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getFunctions()",
      "begin_line": 498,
      "end_line": 506,
      "comment": "\n     * Returns the set of functions installed on the context.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setFactory(org.apache.commons.jxpath.AbstractFactory)",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n     * Install an abstract factory that should be used by the\n     * \u003ccode\u003ecreatePath()\u003c/code\u003e and \u003ccode\u003ecreatePathAndSetValue()\u003c/code\u003e\n     * methods.\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getFactory()",
      "begin_line": 522,
      "end_line": 527,
      "comment": "\n     * Returns the AbstractFactory installed on this context.\n     * If none has been installed and this context has a parent context,\n     * returns the parent\u0027s factory.  Otherwise returns null.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setLocale(java.util.Locale)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n     * Set the locale for this context.  The value of the \"lang\"\n     * attribute as well as the the lang() function will be\n     * affected by the locale.  By default, JXPath uses\n     * \u003ccode\u003eLocale.getDefault()\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getLocale()",
      "begin_line": 544,
      "end_line": 552,
      "comment": "\n     * Returns the locale set with setLocale. If none was set and\n     * the context has a parent, returns the parent\u0027s locale.\n     * Otherwise, returns Locale.getDefault().\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setDecimalFormatSymbols(java.lang.String, java.text.DecimalFormatSymbols)",
      "begin_line": 562,
      "end_line": 570,
      "comment": "\n     * Sets DecimalFormatSymbols for a given name. The DecimalFormatSymbols can\n     * be referenced as the third, optional argument in the invocation of\n     * \u003ccode\u003eformat-number (number,format,decimal-format-name)\u003c/code\u003e function.\n     * By default, JXPath uses the symbols for the current locale.\n     * \n     * @param name the format name or null for default format.\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getDecimalFormatSymbols(java.lang.String)",
      "begin_line": 575,
      "end_line": 580,
      "comment": "\n     * @see #setDecimalFormatSymbols(String, DecimalFormatSymbols)\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setLenient(boolean)",
      "begin_line": 591,
      "end_line": 594,
      "comment": "\n     * If the context is in the lenient mode, then getValue() returns null\n     * for inexistent paths.  Otherwise, a path that does not map to\n     * an existing property will throw an exception.  Note that if the\n     * property exists, but its value is null, the exception is \u003ci\u003enot\u003c/i\u003e\n     * thrown.\n     * \u003cp\u003e\n     * By default, lenient \u003d false\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 31)",
        "(line 593,col 9)-(line 593,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.isLenient()",
      "begin_line": 599,
      "end_line": 604,
      "comment": "\n     * @see #setLenient(boolean)\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.compile(java.lang.String)",
      "begin_line": 613,
      "end_line": 618,
      "comment": "\n     * Compiles the supplied XPath and returns an internal representation\n     * of the path that can then be evaluated.  Use CompiledExpressions\n     * when you need to evaluate the same expression multiple times\n     * and there is a convenient place to cache CompiledExpression\n     * between invocations.\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.compilePath(java.lang.String)",
      "begin_line": 624,
      "end_line": 624,
      "comment": "\n     * Overridden by each concrete implementation of JXPathContext\n     * to perform compilation. Is called by \u003ccode\u003ecompile()\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.selectSingleNode(java.lang.String)",
      "begin_line": 636,
      "end_line": 639,
      "comment": "\n     * Finds the first object that matches the specified XPath. It is equivalent\n     * to \u003ccode\u003egetPointer(xpath).getNode()\u003c/code\u003e. Note that this method\n     * produces the same result as \u003ccode\u003egetValue()\u003c/code\u003e on object models\n     * like JavaBeans, but a different result for DOM/JDOM etc., because it\n     * returns the Node itself, rather than its textual contents.\n     * \n     * @param xpath the xpath to be evaluated\n     * @return the found object\n     ",
      "child_ranges": [
        "(line 637,col 6)-(line 637,col 41)",
        "(line 638,col 9)-(line 638,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.selectNodes(java.lang.String)",
      "begin_line": 647,
      "end_line": 655,
      "comment": "\n     * Finds all nodes that match the specified XPath. \n     *   \n     * @param xpath the xpath to be evaluated\n     * @return a list of found objects\n     ",
      "child_ranges": [
        "(line 648,col 6)-(line 648,col 38)",
        "(line 649,col 6)-(line 649,col 48)",
        "(line 650,col 6)-(line 653,col 3)",
        "(line 654,col 3)-(line 654,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getValue(java.lang.String)",
      "begin_line": 661,
      "end_line": 661,
      "comment": "\n     * Evaluates the xpath and returns the resulting object. Primitive\n     * types are wrapped into objects.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getValue(java.lang.String, java.lang.Class)",
      "begin_line": 667,
      "end_line": 667,
      "comment": "\n     * Evaluates the xpath, converts the result to the specified class and\n     * returns the resulting object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setValue(java.lang.String, java.lang.Object)",
      "begin_line": 677,
      "end_line": 677,
      "comment": "\n     * Modifies the value of the property described by the supplied xpath.\n     * Will throw an exception if one of the following conditions occurs:\n     * \u003cul\u003e\n     * \u003cli\u003eThe xpath does not in fact describe an existing property\n     * \u003cli\u003eThe property is not writable (no public, non-static set method)\n     * \u003c/ul\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.createPath(java.lang.String)",
      "begin_line": 686,
      "end_line": 686,
      "comment": "\n     * Creates missing elements of the path by invoking an AbstractFactory,\n     * which should first be installed on the context by calling \"setFactory\".\n     * \u003cp\u003e\n     * Will throw an exception if the AbstractFactory fails to create\n     * an instance for a path element.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.createPathAndSetValue(java.lang.String, java.lang.Object)",
      "begin_line": 702,
      "end_line": 702,
      "comment": "\n     * The same as setValue, except it creates intermediate elements of\n     * the path by invoking an AbstractFactory, which should first be\n     * installed on the context by calling \"setFactory\".\n     * \u003cp\u003e\n     * Will throw an exception if one of the following conditions occurs:\n     * \u003cul\u003e\n     * \u003cli\u003eElements of the xpath aleady exist, but the path does not in\n     *  fact describe an existing property\n     * \u003cli\u003eThe AbstractFactory fails to create an instance for an intermediate\n     * element.\n     * \u003cli\u003eThe property is not writable (no public, non-static set method)\n     * \u003c/ul\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.removePath(java.lang.String)",
      "begin_line": 707,
      "end_line": 707,
      "comment": "\n     * Removes the element of the object graph described by the xpath.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.removeAll(java.lang.String)",
      "begin_line": 712,
      "end_line": 712,
      "comment": "\n     * Removes all elements of the object graph described by the xpath.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.iterate(java.lang.String)",
      "begin_line": 719,
      "end_line": 719,
      "comment": "\n     * Traverses the xpath and returns an Iterator of all results found\n     * for the path. If the xpath matches no properties\n     * in the graph, the Iterator will be empty, but not null.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getPointer(java.lang.String)",
      "begin_line": 727,
      "end_line": 727,
      "comment": "\n     * Traverses the xpath and returns a Pointer.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the pointer will be null.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.iteratePointers(java.lang.String)",
      "begin_line": 735,
      "end_line": 735,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setIdentityManager(org.apache.commons.jxpath.IdentityManager)",
      "begin_line": 741,
      "end_line": 743,
      "comment": "\n     * Install an identity manager that will be used by the context\n     * to look up a node by its ID.\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getIdentityManager()",
      "begin_line": 749,
      "end_line": 754,
      "comment": "\n     * Returns this context\u0027s identity manager. If none has been installed,\n     * returns the identity manager of the parent context.\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getPointerByID(java.lang.String)",
      "begin_line": 761,
      "end_line": 769,
      "comment": "\n     * Locates a Node by its ID.\n     *\n     * @param id is the ID of the sought node.\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 55)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 768,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setKeyManager(org.apache.commons.jxpath.KeyManager)",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\n     * Install a key manager that will be used by the context\n     * to look up a node by a key value.\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getKeyManager()",
      "begin_line": 783,
      "end_line": 788,
      "comment": "\n     * Returns this context\u0027s key manager. If none has been installed,\n     * returns the key manager of the parent context.\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 787,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getPointerByKey(java.lang.String, java.lang.String)",
      "begin_line": 793,
      "end_line": 801,
      "comment": "\n     * Locates a Node by a key value.\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 45)",
        "(line 795,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 800,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getNodeSetByKey(java.lang.String, java.lang.Object)",
      "begin_line": 808,
      "end_line": 816,
      "comment": "\n     * Locates a NodeSet by key/value.\n     * @param key\n     * @param value\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 45)",
        "(line 810,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 815,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.registerNamespace(java.lang.String, java.lang.String)",
      "begin_line": 824,
      "end_line": 827,
      "comment": "\n     * Registers a namespace prefix.\n     * \n     * @param prefix A namespace prefix\n     * @param namespaceURI A URI for that prefix\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 826,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getNamespaceURI(java.lang.String)",
      "begin_line": 839,
      "end_line": 842,
      "comment": "\n     * Given a prefix, returns a registered namespace URI. If the requested\n     * prefix was not defined explicitly using the registerNamespace method,\n     * JXPathContext will then check the context node to see if the prefix is\n     * defined there. See\n     * {@link #setNamespaceContextPointer(Pointer) setNamespaceContextPointer}.\n     * \n     * @param prefix The namespace prefix to look up\n     * @return namespace URI or null if the prefix is undefined.\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 841,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getPrefix(java.lang.String)",
      "begin_line": 850,
      "end_line": 853,
      "comment": "\n     * Get the prefix associated with the specifed namespace URI.\n     * @param namespaceURI the ns URI to check.\n     * @return String prefix\n     * @since JXPath 1.3\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 852,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.setNamespaceContextPointer(org.apache.commons.jxpath.Pointer)",
      "begin_line": 864,
      "end_line": 867,
      "comment": "\n     * Namespace prefixes can be defined implicitly by specifying a pointer to a\n     * context where the namespaces are defined. By default,\n     * NamespaceContextPointer is the same as the Context Pointer, see\n     * {@link #getContextPointer() getContextPointer()}\n     * \n     * @param namespaceContextPointer The pointer to the context where prefixes used in\n     *        XPath expressions should be resolved.\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 866,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContext.getNamespaceContextPointer()",
      "begin_line": 876,
      "end_line": 879,
      "comment": "\n     * Returns the namespace context pointer set with\n     * {@link #setNamespaceContextPointer(Pointer) setNamespaceContextPointer()}\n     * or, if none has been specified, the context pointer otherwise.\n     * \n     * @return The namespace context pointer.\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 878,col 78)"
      ]
    }
  ]
}