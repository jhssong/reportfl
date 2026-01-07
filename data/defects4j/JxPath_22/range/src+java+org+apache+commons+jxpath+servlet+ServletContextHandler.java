{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/servlet/ServletContextHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ServletContextHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.DynamicPropertyHandler"
      ],
      "begin_line": 34,
      "end_line": 66,
      "comment": "\n * Implementation of the {@link DynamicPropertyHandler} interface that provides\n * access to attributes of a {@link ServletContext}.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PROPERTY_COUNT"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletContextHandler.getPropertyNames(java.lang.Object)",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 55)",
        "(line 40,col 9)-(line 40,col 44)",
        "(line 41,col 9)-(line 41,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletContextHandler.collectPropertyNames(java.util.Set, java.lang.Object)",
      "begin_line": 49,
      "end_line": 57,
      "comment": "\n     * Collect the property names from bean, storing in set.\n     * @param set destination\n     * @param bean to read\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 68)",
        "(line 54,col 9)-(line 56,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletContextHandler.getProperty(java.lang.Object, java.lang.String)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletContextHandler.setProperty(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 65)"
      ]
    }
  ]
}