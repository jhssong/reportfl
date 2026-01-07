{
  "filepath": "/tmp/JxPath-13b/src/java/org/apache/commons/jxpath/ri/model/dynamic/DynamicPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 38,
      "end_line": 126,
      "comment": "\n * A  Pointer that points to an object with Dynamic Properties. It is used for\n * the first element of a path; following elements will by of type\n * PropertyPointer.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.DynamicPointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.DynamicPropertyHandler, java.util.Locale)",
      "begin_line": 43,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 28)",
        "(line 47,col 9)-(line 47,col 25)",
        "(line 48,col 9)-(line 48,col 25)",
        "(line 49,col 9)-(line 49,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.DynamicPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.DynamicPropertyHandler)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 22)",
        "(line 56,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 57,col 25)",
        "(line 58,col 9)-(line 58,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getPropertyPointer()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.createNodeIterator(java.lang.String, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getName()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isDynamicPropertyDeclarationSupported()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getBaseValue()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns the DP object iself.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isLeaf()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 33)",
        "(line 92,col 9)-(line 92,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isCollection()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getLength()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns 1.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.asPath()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.hashCode()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.equals(java.lang.Object)",
      "begin_line": 114,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 55)",
        "(line 124,col 9)-(line 124,col 61)"
      ]
    }
  ]
}