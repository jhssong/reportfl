{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/JXPathIntrospector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathIntrospector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 197,
      "comment": "\n * JXPathIntrospector  maintains a registry of {@link JXPathBeanInfo\n * JXPathBeanInfo} objects for Java classes.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "byClass"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byInterface"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.registerAtomicClass(java.lang.Class)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Automatically creates and registers a JXPathBeanInfo object\n     * for the specified class. That object returns true to isAtomic().\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.registerDynamicClass(java.lang.Class, java.lang.Class)",
      "begin_line": 74,
      "end_line": 86,
      "comment": "\n     * Automatically creates and registers a JXPathBeanInfo object\n     * for the specified class. That object returns true to isDynamic().\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 79,col 76)",
        "(line 80,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.getBeanInfo(java.lang.Class)",
      "begin_line": 101,
      "end_line": 114,
      "comment": "\n     * Creates  and registers a JXPathBeanInfo object for the supplied class. If\n     * the class has already been registered, returns the registered\n     * JXPathBeanInfo object.\n     * \u003cp\u003e\n     * The process of creation of JXPathBeanInfo is as follows:\n     * \u003cul\u003e\n     * \u003cli\u003eIf class named \u003ccode\u003e\u0026lt;beanClass\u0026gt;XBeanInfo\u003c/code\u003e exists,\n     *     an instance of that class is allocated.\n     * \u003cli\u003eOtherwise, an instance of {@link JXPathBasicBeanInfo\n     *     JXPathBasicBeanInfo}  is allocated.\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 74)",
        "(line 103,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.findDynamicBeanInfo(java.lang.Class)",
      "begin_line": 120,
      "end_line": 148,
      "comment": "\n     * Find a dynamic bean info if available for any superclasses or\n     * interfaces.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 55)",
        "(line 130,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 140,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.findInformant(java.lang.Class)",
      "begin_line": 150,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 56)",
        "(line 152,col 9)-(line 157,col 9)",
        "(line 160,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathIntrospector.instantiate(java.lang.Class, java.lang.String)",
      "begin_line": 177,
      "end_line": 196,
      "comment": "\n     * Try to create an instance of a named class.\n     * First try the classloader of \"sibling\", then try the system\n     * classloader.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 191,col 9)",
        "(line 194,col 9)-(line 194,col 45)",
        "(line 195,col 9)-(line 195,col 33)"
      ]
    }
  ]
}