{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/model/dynamic/DynamicPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 38,
      "end_line": 131,
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
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.DynamicPointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.DynamicPropertyHandler, java.util.Locale)",
      "begin_line": 44,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 28)",
        "(line 48,col 9)-(line 48,col 25)",
        "(line 49,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 50,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.DynamicPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.DynamicPropertyHandler)",
      "begin_line": 53,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 22)",
        "(line 57,col 9)-(line 57,col 25)",
        "(line 58,col 9)-(line 58,col 25)",
        "(line 59,col 9)-(line 59,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getPropertyPointer()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.createNodeIterator(java.lang.String, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getName()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isDynamicPropertyDeclarationSupported()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getBaseValue()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Returns the DP object iself.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isLeaf()",
      "begin_line": 91,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)",
        "(line 93,col 9)-(line 94,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isCollection()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getLength()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Returns 1.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.asPath()",
      "begin_line": 108,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.hashCode()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.equals(java.lang.Object)",
      "begin_line": 119,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 55)",
        "(line 129,col 9)-(line 129,col 61)"
      ]
    }
  ]
}