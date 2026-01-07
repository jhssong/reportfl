{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyOwnerPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyOwnerPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 38,
      "end_line": 181,
      "comment": "\n * A pointer describing a node that has properties, each of which could be\n * a collection.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 40,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.createNodeIterator(java.lang.String, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.PropertyOwnerPointer(org.apache.commons.jxpath.ri.model.NodePointer, java.util.Locale)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.PropertyOwnerPointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.setIndex(int)",
      "begin_line": 92,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getImmediateNode()",
      "begin_line": 102,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getName()",
      "begin_line": 114,
      "end_line": 114,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.setValue(java.lang.Object)",
      "begin_line": 120,
      "end_line": 140,
      "comment": "\n     * Throws an exception if you try to change the root element, otherwise\n     * forwards the call to the parent pointer.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.remove()",
      "begin_line": 146,
      "end_line": 156,
      "comment": "\n     * If this is a root node pointer, throws an exception; otherwise\n     * forwards the call to the parent node.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 26)",
        "(line 148,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getPropertyPointer()",
      "begin_line": 158,
      "end_line": 158,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.isDynamicPropertyDeclarationSupported()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * @return true if the property owner can set a property \"does not exist\".\n     *         A good example is a Map. You can always assign a value to any\n     *         key even if it has never been \"declared\".\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 169,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 47)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 57)"
      ]
    }
  ]
}