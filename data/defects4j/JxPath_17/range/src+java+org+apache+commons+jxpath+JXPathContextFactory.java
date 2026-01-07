{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/JXPathContextFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 248,
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
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Create a new JXPathContextFactory.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContextFactory.newInstance()",
      "begin_line": 101,
      "end_line": 122,
      "comment": "\n     * Obtain a new instance of a \u003ccode\u003eJXPathContextFactory\u003c/code\u003e.\n     * This static method creates a new factory instance.\n     * This method uses the following ordered lookup procedure to determine\n     * the \u003ccode\u003eJXPathContextFactory\u003c/code\u003e implementation class to load:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * Use  the \u003ccode\u003eorg.apache.commons.jxpath.JXPathContextFactory\u003c/code\u003e\n     * system property.\n     * \u003c/li\u003e\n     * \u003cli\u003e\n     * Alternatively, use the JAVA_HOME (the parent directory where jdk is\n     * installed)/lib/jxpath.properties for a property file that contains the\n     * name of the implementation class keyed on\n     * \u003ccode\u003eorg.apache.commons.jxpath.JXPathContextFactory\u003c/code\u003e.\n     * \u003c/li\u003e\n     * \u003cli\u003e\n     * Use the Services API (as detailed in the JAR specification), if\n     * available, to determine the classname. The Services API will look\n     * for a classname in the file\n     * \u003ccode\u003eMETA- INF/services/\u003ci\u003eorg.apache.commons.jxpath.\n     * JXPathContextFactory\u003c/i\u003e\u003c/code\u003e in jars available to the runtime.\n     * \u003c/li\u003e\n     * \u003cli\u003e\n     * Platform default \u003ccode\u003eJXPathContextFactory\u003c/code\u003e instance.\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * Once an application has obtained a reference to a\n     * \u003ccode\u003eJXPathContextFactory\u003c/code\u003e it can use the factory to\n     * obtain JXPathContext instances.\n     *\n     * @return JXPathContextFactory\n     * @exception JXPathContextFactoryConfigurationError if the implementation\n     *            is not available or cannot be instantiated.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 41)",
        "(line 108,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContextFactory.newContext(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "debug"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Temp debug code - this will be removed after we test everything\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContextFactory.findFactory(java.lang.String, java.lang.String)",
      "begin_line": 163,
      "end_line": 247,
      "comment": "\n     * Private implementation method - will find the implementation\n     * class in the specified order.\n     * @param property    Property name\n     * @param defaultFactory Default implementation, if nothing else is found\n     *\n     * @return class name of the JXPathContextFactory\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 178,col 8)",
        "(line 181,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 59)",
        "(line 211,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 30)"
      ]
    }
  ]
}