{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/VariablePointerFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariablePointerFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointerFactory"
      ],
      "begin_line": 31,
      "end_line": 108,
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
      "end_line": 52,
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
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.VariableContextWrapper.getContext()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n         * Get the original (unwrapped) context.\n         *\n         * @return JXPathContext.\n         ",
      "child_ranges": [
        "(line 50,col 13)-(line 50,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.contextWrapper(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * VariableContextWrapper factory method.\n     * @param context the JXPathContext to wrap.\n     * @return VariableContextWrapper.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 69,
      "end_line": 86,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.jxpath.ri.model.NodePointerFactory#createNodePointer(org.apache.commons.jxpath.ri.QName,\n     *      java.lang.Object, java.util.Locale)\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.jxpath.ri.model.NodePointerFactory#createNodePointer(org.apache.commons.jxpath.ri.model.NodePointer,\n     *      org.apache.commons.jxpath.ri.QName, java.lang.Object)\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.getOrder()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.jxpath.ri.model.NodePointerFactory#getOrder()\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 46)"
      ]
    }
  ]
}