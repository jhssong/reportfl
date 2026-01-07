{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/beans/PropertyOwnerPointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyOwnerPointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 38,
      "end_line": 185,
      "comment": "\n * A pointer describing a node that has properties, each of which could be\n * a collection.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNINITIALIZED"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 43,
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
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Create a NodeIterator.\n     * @param property property name\n     * @param reverse whether to iterate in reverse\n     * @param startWith first pointer to return\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.PropertyOwnerPointer(org.apache.commons.jxpath.ri.model.NodePointer, java.util.Locale)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Create a new PropertyOwnerPointer.\n     * @param parent parent pointer\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.PropertyOwnerPointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Create a new PropertyOwnerPointer.\n     * @param parent pointer\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.setIndex(int)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getImmediateNode()",
      "begin_line": 101,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getName()",
      "begin_line": 109,
      "end_line": 109,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.isValidProperty(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Learn whether \u003ccode\u003ename\u003c/code\u003e is a valid child name for this PropertyOwnerPointer.\n     * @param name the QName to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eQName\u003c/code\u003e is a valid property name.\n     * @since JXPath 1.3\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.setValue(java.lang.Object)",
      "begin_line": 126,
      "end_line": 146,
      "comment": "\n     * Throws an exception if you try to change the root element, otherwise\n     * forwards the call to the parent pointer.\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 27)",
        "(line 128,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.remove()",
      "begin_line": 152,
      "end_line": 162,
      "comment": "\n     * If this is a root node pointer, throws an exception; otherwise\n     * forwards the call to the parent node.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 26)",
        "(line 154,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getPropertyPointer()",
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * Get a PropertyPointer for this PropertyOwnerPointer.\n     * @return PropertyPointer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.isDynamicPropertyDeclarationSupported()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Learn whether dynamic property declaration is supported.\n     * @return true if the property owner can set a property \"does not exist\".\n     *         A good example is a Map. You can always assign a value to any\n     *         key even if it has never been \"declared\".\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 87)",
        "(line 183,col 9)-(line 183,col 70)"
      ]
    }
  ]
}