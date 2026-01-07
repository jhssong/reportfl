{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/VariablePointerFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariablePointerFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointerFactory"
      ],
      "begin_line": 31,
      "end_line": 96,
      "comment": "\n * NodePointerFactory to create {@link VariablePointer VariablePointers}.\n * @author Matt Benson\n * @since JXPath 1.3\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VARIABLE_POINTER_FACTORY_ORDER"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " factory order constant "
    },
    {
      "type": "class_interface",
      "name": "VariableContextWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 57,
      "comment": "\n     * Node value wrapper to trigger a VariablePointerFactory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.VariableContextWrapper.VariableContextWrapper(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n         * Create a new VariableContextWrapper.\n         * @param context to wrap\n         ",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.VariableContextWrapper.getContext()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n         * Get the original (unwrapped) context.\n         *\n         * @return JXPathContext.\n         ",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.contextWrapper(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * VariableContextWrapper factory method.\n     * @param context the JXPathContext to wrap.\n     * @return VariableContextWrapper.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 68,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.createNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.VariablePointerFactory.getOrder()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 46)"
      ]
    }
  ]
}