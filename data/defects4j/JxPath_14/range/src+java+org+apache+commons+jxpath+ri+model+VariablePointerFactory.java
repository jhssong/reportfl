{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/ri/model/VariablePointerFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariablePointerFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointerFactory"
      ],
      "begin_line": 31,
      "end_line": 99,
      "comment": "\n * NodePointerFactory to create VariablePointers.\n * @author Matt Benson\n * @since JXPath 1.3\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VARIABLE_POINTER_FACTORY_ORDER"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableContextWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 43,
      "comment": "\n     * Node value wrapper to trigger a VariablePointerFactory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.VariableContextWrapper.VariableContextWrapper(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.contextWrapper(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * VariableContextWrapper factory method.\n     * @param context the JXPathContext to wrap.\n     * @return VariableContextWrapper.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 60,
      "end_line": 77,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see org.apache.commons.jxpath.ri.model.NodePointerFactory#createNodePointer(org.apache.commons.jxpath.ri.QName,\n     *      java.lang.Object, java.util.Locale)\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see org.apache.commons.jxpath.ri.model.NodePointerFactory#createNodePointer(org.apache.commons.jxpath.ri.model.NodePointer,\n     *      org.apache.commons.jxpath.ri.QName, java.lang.Object)\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.getOrder()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see org.apache.commons.jxpath.ri.model.NodePointerFactory#getOrder()\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 46)"
      ]
    }
  ]
}