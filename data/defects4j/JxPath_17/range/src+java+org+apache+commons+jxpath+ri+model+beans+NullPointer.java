{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/beans/NullPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer"
      ],
      "begin_line": 30,
      "end_line": 188,
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.NullPointer(org.apache.commons.jxpath.ri.QName, java.util.Locale)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Create a new NullPointer.\n     * @param name node name\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 28)",
        "(line 41,col 9)-(line 41,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.NullPointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Used for the root node.\n     * @param parent parent pointer\n     * @param name node name\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 22)",
        "(line 51,col 9)-(line 51,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.NullPointer(java.util.Locale, java.lang.String)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Create a new NullPointer.\n     * @param locale Locale\n     * @param id String\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 28)",
        "(line 61,col 9)-(line 61,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.getName()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.getBaseValue()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.isCollection()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.isLeaf()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.isActual()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.getPropertyPointer()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 114,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 125,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.hashCode()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.equals(java.lang.Object)",
      "begin_line": 159,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 49)",
        "(line 169,col 9)-(line 169,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.asPath()",
      "begin_line": 175,
      "end_line": 180,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullPointer.getLength()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 17)"
      ]
    }
  ]
}