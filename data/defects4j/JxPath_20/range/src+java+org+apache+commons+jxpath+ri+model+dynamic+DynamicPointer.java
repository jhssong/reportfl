{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/model/dynamic/DynamicPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 38,
      "end_line": 144,
      "comment": "\n * A Pointer that points to an object with Dynamic Properties. It is used for\n * the first element of a path; following elements will by of type\n * {@link PropertyPointer}.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.DynamicPointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.DynamicPropertyHandler, java.util.Locale)",
      "begin_line": 52,
      "end_line": 58,
      "comment": "\n     * Create a new DynamicPointer.\n     * @param name property name\n     * @param bean owning bean\n     * @param handler DynamicPropertyHandler\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 28)",
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 57,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.DynamicPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object, org.apache.commons.jxpath.DynamicPropertyHandler)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "\n     * Create a new DynamicPointer.\n     * @param parent parent pointer\n     * @param name property name\n     * @param bean owning bean\n     * @param handler DynamicPropertyHandler\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getPropertyPointer()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.createNodeIterator(java.lang.String, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getName()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isDynamicPropertyDeclarationSupported()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getBaseValue()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Returns the DP object iself.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isLeaf()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 33)",
        "(line 106,col 9)-(line 106,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.isCollection()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.getLength()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Returns 1.\n     * @return int\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.asPath()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.hashCode()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.equals(java.lang.Object)",
      "begin_line": 129,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 55)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 77)"
      ]
    }
  ]
}