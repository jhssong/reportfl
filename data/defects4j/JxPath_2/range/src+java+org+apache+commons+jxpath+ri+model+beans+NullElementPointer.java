{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/model/beans/NullElementPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullElementPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.CollectionPointer"
      ],
      "begin_line": 34,
      "end_line": 135,
      "comment": "\n * Used when there is a need to construct a Pointer for a collection element\n * that does not exist.  For example, if the path is \"foo[3]\", but the\n * collection \"foo\" only has one element or is empty or is null, the\n * NullElementPointer can be used to capture this situation without putting a\n * regular NodePointer into an invalid state.  Just create a NullElementPointer\n * with index 2 (\u003d 3 - 1) and a \"foo\" pointer as the parent.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.NullElementPointer(org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 37)",
        "(line 38,col 9)-(line 38,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getName()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getBaseValue()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getImmediateNode()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.isLeaf()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.isCollection()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getPropertyPointer()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getValuePointer()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.setValue(java.lang.Object)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 71,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.isActual()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.isContainer()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.hashCode()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.equals(java.lang.Object)",
      "begin_line": 94,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 63)",
        "(line 104,col 9)-(line 105,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.getLength()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.NullElementPointer.asPath()",
      "begin_line": 112,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 57)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 33)"
      ]
    }
  ]
}