{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/servlet/ServletContextHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ServletContextHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.DynamicPropertyHandler"
      ],
      "begin_line": 33,
      "end_line": 62,
      "comment": "\n * Implementation of the {@link DynamicPropertyHandler} interface that provides\n * access to attributes of a {@link ServletContext}.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PROPERTY_COUNT"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletContextHandler.getPropertyNames(java.lang.Object)",
      "begin_line": 37,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 59)",
        "(line 39,col 9)-(line 39,col 44)",
        "(line 40,col 9)-(line 40,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletContextHandler.collectPropertyNames(java.util.HashSet, java.lang.Object)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Collect the property names from bean, storing in set.\n     * @param set destination\n     * @param bean to read\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 68)",
        "(line 50,col 9)-(line 52,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletContextHandler.getProperty(java.lang.Object, java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletContextHandler.setProperty(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 65)"
      ]
    }
  ]
}