{
  "filepath": "/tmp/JxPath-7b/src/java/org/apache/commons/jxpath/JXPathContextFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 242,
      "comment": "\n * Defines a factory API that enables applications to obtain a\n * JXPathContext instance.  To acquire a JXPathContext, first call the\n * static \u003ccode\u003enewInstance()\u003c/code\u003e method of JXPathContextFactory.\n * This method returns a concrete JXPathContextFactory.\n * Then call \u003ccode\u003enewContext()\u003c/code\u003e on that instance.  You will rarely\n * need to perform these steps explicitly: usually you can call one of the\n * \u003ccode\u003eJXPathContex.newContext\u003c/code\u003e methods, which will perform these steps\n * for you.\n *\n * @see JXPathContext#newContext(Object)\n * @see JXPathContext#newContext(JXPathContext,Object)\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_NAME_PROPERTY"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": " The default property "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FACTORY_CLASS"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": " The default factory class "
    },
    {
      "type": "field",
      "varNames": [
        "factoryImplName"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Avoid reading all the files when the findFactory\n        method is called the second time ( cache the result of\n        finding the default impl )\n    "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathContextFactory.JXPathContextFactory()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContextFactory.newInstance()",
      "begin_line": 97,
      "end_line": 118,
      "comment": "\n     * Obtain a new instance of a \u003ccode\u003eJXPathContextFactory\u003c/code\u003e.\n     * This static method creates a new factory instance.\n     * This method uses the following ordered lookup procedure to determine\n     * the \u003ccode\u003eJXPathContextFactory\u003c/code\u003e implementation class to load:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * Use  the \u003ccode\u003eorg.apache.commons.jxpath.JXPathContextFactory\u003c/code\u003e\n     * system property.\n     * \u003c/li\u003e\n     * \u003cli\u003e\n     * Alternatively, use the JAVA_HOME (the parent directory where jdk is\n     * installed)/lib/jxpath.properties for a property file that contains the\n     * name of the implementation class keyed on\n     * \u003ccode\u003eorg.apache.commons.jxpath.JXPathContextFactory\u003c/code\u003e.\n     * \u003c/li\u003e\n     * \u003cli\u003e\n     * Use the Services API (as detailed in the JAR specification), if\n     * available, to determine the classname. The Services API will look\n     * for a classname in the file\n     * \u003ccode\u003eMETA- INF/services/\u003ci\u003eorg.apache.commons.jxpath.\n     * JXPathContextFactory\u003c/i\u003e\u003c/code\u003e in jars available to the runtime.\n     * \u003c/li\u003e\n     * \u003cli\u003e\n     * Platform default \u003ccode\u003eJXPathContextFactory\u003c/code\u003e instance.\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * Once an application has obtained a reference to a\n     * \u003ccode\u003eJXPathContextFactory\u003c/code\u003e it can use the factory to\n     * obtain JXPathContext instances.\n     *\n     * @exception JXPathFactoryConfigurationError if the implementation is not\n     * available or cannot be instantiated.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 41)",
        "(line 104,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContextFactory.newContext(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "debug"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Temp debug code - this will be removed after we test everything\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContextFactory.findFactory(java.lang.String, java.lang.String)",
      "begin_line": 157,
      "end_line": 241,
      "comment": " Private implementation method - will find the implementation\n        class in the specified order.\n        @param property    Property name\n        @param defaultFactory Default implementation, if nothing else is found\n        \n        @return class name of the JXPathContextFactory\n    ",
      "child_ranges": [
        "(line 159,col 9)-(line 172,col 8)",
        "(line 175,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 205,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 30)"
      ]
    }
  ]
}