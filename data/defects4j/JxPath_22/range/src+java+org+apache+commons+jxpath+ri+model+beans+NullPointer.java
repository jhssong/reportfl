{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/model/beans/NullPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 30,
      "end_line": 148,
      "comment": "\n * Pointer whose value is \u003ccode\u003enull\u003c/code\u003e.\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.NullPointer(org.apache.commons.jxpath.ri.QName, java.util.Locale)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Create a new NullPointer.\n     * @param name node name\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 28)",
        "(line 43,col 9)-(line 43,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.NullPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Used for the root node.\n     * @param parent parent pointer\n     * @param name node name\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 22)",
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.NullPointer(java.util.Locale, java.lang.String)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Create a new NullPointer.\n     * @param locale Locale\n     * @param id String\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)",
        "(line 63,col 9)-(line 63,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.getName()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.getBaseValue()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.isCollection()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.isLeaf()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.isActual()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.getPropertyPointer()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 95,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 98,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 103,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 106,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 113,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.hashCode()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.equals(java.lang.Object)",
      "begin_line": 125,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 49)",
        "(line 135,col 9)-(line 135,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.asPath()",
      "begin_line": 138,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.getLength()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 17)"
      ]
    }
  ]
}