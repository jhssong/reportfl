{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/JXPathIntrospector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathIntrospector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 218,
      "comment": "\n * JXPathIntrospector  maintains a registry of {@link JXPathBeanInfo\n * JXPathBeanInfo} objects for Java classes.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "byClass"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byInterface"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.registerAtomicClass(java.lang.Class)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Automatically creates and registers a JXPathBeanInfo object\n     * for the specified class. That object returns true to isAtomic().\n     * @param beanClass to register\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.registerDynamicClass(java.lang.Class, java.lang.Class)",
      "begin_line": 81,
      "end_line": 91,
      "comment": "\n     * Automatically creates and registers a {@link JXPathBeanInfo} object\n     * for the specified class. That object returns true to\n     * {@link JXPathBeanInfo#isDynamic()}.\n     *\n     * @param beanClass to register\n     * @param dynamicPropertyHandlerClass to handle beanClass\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 84,col 76)",
        "(line 85,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.getBeanInfo(java.lang.Class)",
      "begin_line": 108,
      "end_line": 121,
      "comment": "\n     * Creates and registers a JXPathBeanInfo object for the supplied class. If\n     * the class has already been registered, returns the registered\n     * JXPathBeanInfo object.\n     * \u003cp\u003e\n     * The process of creation of JXPathBeanInfo is as follows:\n     * \u003cul\u003e\n     * \u003cli\u003eIf class named \u003ccode\u003e\u0026lt;beanClass\u0026gt;XBeanInfo\u003c/code\u003e exists,\n     *     an instance of that class is allocated.\n     * \u003cli\u003eOtherwise, an instance of {@link JXPathBasicBeanInfo\n     *     JXPathBasicBeanInfo}  is allocated.\n     * \u003c/ul\u003e\n     * @param beanClass whose info to get\n     * @return JXPathBeanInfo\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 74)",
        "(line 110,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.findDynamicBeanInfo(java.lang.Class)",
      "begin_line": 129,
      "end_line": 157,
      "comment": "\n     * Find a dynamic bean info if available for any superclasses or\n     * interfaces.\n     * @param beanClass to search for\n     * @return JXPathBeanInfo\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 55)",
        "(line 139,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 46)",
        "(line 149,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.findInformant(java.lang.Class)",
      "begin_line": 168,
      "end_line": 188,
      "comment": "\n     * find a JXPathBeanInfo instance for the specified class.\n     * Similar to javax.beans property handler discovery; search for a\n     * class with \"XBeanInfo\" appended to beanClass.name, then check\n     * whether beanClass implements JXPathBeanInfo for itself.\n     * Invokes the default constructor for any class it finds.\n     * @param beanClass for which to look for an info provider\n     * @return JXPathBeanInfo instance or null if none found\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 56)",
        "(line 170,col 9)-(line 175,col 9)",
        "(line 178,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.instantiate(java.lang.Class, java.lang.String)",
      "begin_line": 199,
      "end_line": 217,
      "comment": "\n     * Try to create an instance of a named class.\n     * First try the classloader of \"sibling\", then try the system\n     * classloader.\n     * @param sibling Class\n     * @param className to instantiate\n     * @return new Object\n     * @throws Exception if instantiation fails\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 50)",
        "(line 204,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 215,col 56)",
        "(line 216,col 9)-(line 216,col 33)"
      ]
    }
  ]
}