{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyOwnerPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyOwnerPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 38,
      "end_line": 175,
      "comment": "\n * A pointer describing a node that has properties, each of which could be\n * a collection.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 40,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 58,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.createNodeIterator(java.lang.String, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 61,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.PropertyOwnerPointer(org.apache.commons.jxpath.ri.model.NodePointer, java.util.Locale)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.PropertyOwnerPointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.setIndex(int)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getImmediateNode()",
      "begin_line": 91,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getName()",
      "begin_line": 99,
      "end_line": 99,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.isValidProperty(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Learn whether \u003ccode\u003ename\u003c/code\u003e is a valid child name for this PropertyOwnerPointer.\n     * @param name the QName to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eQName\u003c/code\u003e is a valid property name.\n     * @since JXPath 1.3\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.setValue(java.lang.Object)",
      "begin_line": 115,
      "end_line": 135,
      "comment": "\n     * Throws an exception if you try to change the root element, otherwise\n     * forwards the call to the parent pointer.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 27)",
        "(line 117,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.remove()",
      "begin_line": 141,
      "end_line": 151,
      "comment": "\n     * If this is a root node pointer, throws an exception; otherwise\n     * forwards the call to the parent node.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 26)",
        "(line 143,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getPropertyPointer()",
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Get a PropertyPointer for this PropertyOwnerPointer.\n     * @return PropertyPointer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.isDynamicPropertyDeclarationSupported()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * @return true if the property owner can set a property \"does not exist\".\n     *         A good example is a Map. You can always assign a value to any\n     *         key even if it has never been \"declared\".\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 168,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 87)",
        "(line 173,col 9)-(line 173,col 70)"
      ]
    }
  ]
}