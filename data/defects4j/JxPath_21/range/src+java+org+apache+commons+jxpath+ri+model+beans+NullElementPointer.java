{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/beans/NullElementPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullElementPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.CollectionPointer"
      ],
      "begin_line": 34,
      "end_line": 144,
      "comment": "\n * Used when there is a need to construct a Pointer for a collection element\n * that does not exist.  For example, if the path is \"foo[3]\", but the\n * collection \"foo\" only has one element or is empty or is null, the\n * NullElementPointer can be used to capture this situation without putting a\n * regular NodePointer into an invalid state.  Just create a NullElementPointer\n * with index 2 (\u003d 3 - 1) and a \"foo\" pointer as the parent.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.NullElementPointer(org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Create a new NullElementPointer.\n     * @param parent parent pointer\n     * @param index int\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 37)",
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getName()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getBaseValue()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getImmediateNode()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.isLeaf()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.isCollection()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getPropertyPointer()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Get the property pointer for this.\n     * @return PropertyPointer\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getValuePointer()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.setValue(java.lang.Object)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 82,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.isActual()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.isContainer()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.hashCode()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.equals(java.lang.Object)",
      "begin_line": 105,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 63)",
        "(line 115,col 9)-(line 116,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getLength()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.asPath()",
      "begin_line": 123,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 49)",
        "(line 125,col 9)-(line 125,col 57)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 33)"
      ]
    }
  ]
}