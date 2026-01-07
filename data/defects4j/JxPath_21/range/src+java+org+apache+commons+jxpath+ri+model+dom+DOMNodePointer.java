{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 54,
      "end_line": 793,
      "comment": "\n * A Pointer that points to a DOM node. Because a DOM Node is not guaranteed Serializable,\n * a DOMNodePointer instance may likewise not be properly Serializable.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaces"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultNamespace"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localNamespaceResolver"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XML_NAMESPACE_URI"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " XML namespace URI "
    },
    {
      "type": "field",
      "varNames": [
        "XMLNS_NAMESPACE_URI"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": " XMLNS namespace URI "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.w3c.dom.Node, java.util.Locale)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Create a new DOMNodePointer.\n     * @param node pointed at\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 28)",
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.w3c.dom.Node, java.util.Locale, java.lang.String)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * Create a new DOMNodePointer.\n     * @param node pointed at\n     * @param locale Locale\n     * @param id string id\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 28)",
        "(line 90,col 9)-(line 90,col 25)",
        "(line 91,col 9)-(line 91,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.w3c.dom.Node)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Create a new DOMNodePointer.\n     * @param parent pointer\n     * @param node pointed\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 22)",
        "(line 101,col 9)-(line 101,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.w3c.dom.Node, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 114,
      "end_line": 163,
      "comment": "\n     * Test a Node.\n     * @param node to test\n     * @param test to execute\n     * @return true if node passes test\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 171,
      "end_line": 178,
      "comment": "\n     * Test string equality.\n     * @param s1 String 1\n     * @param s2 String 2\n     * @return true if \u003d\u003d or .equals()\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 41)",
        "(line 176,col 9)-(line 176,col 41)",
        "(line 177,col 9)-(line 177,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName()",
      "begin_line": 180,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 25)",
        "(line 182,col 9)-(line 182,col 25)",
        "(line 183,col 9)-(line 183,col 38)",
        "(line 184,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceResolver()",
      "begin_line": 215,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 223,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 32)",
        "(line 237,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 42)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 271,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 274,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 329,
      "end_line": 333,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     * @param lang ns to test\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 39)",
        "(line 331,col 9)-(line 332,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)",
      "begin_line": 342,
      "end_line": 354,
      "comment": "\n     * Find the nearest occurrence of the specified attribute\n     * on the specified and enclosing elements.\n     * @param n current node\n     * @param attrName attribute name\n     * @return attribute value\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * Get the language attribute for this node.\n     * @return String language name\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 371,
      "end_line": 413,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 415,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 425,col 23)",
        "(line 426,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 440,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 443,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 60)",
        "(line 446,col 9)-(line 446,col 28)",
        "(line 447,col 9)-(line 447,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 450,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 41)",
        "(line 455,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 50)",
        "(line 474,col 9)-(line 474,col 26)",
        "(line 475,col 9)-(line 475,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 478,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 43)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 486,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 491,col 49)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByQName()",
      "begin_line": 556,
      "end_line": 566,
      "comment": "\n     * Get relative position of this among like-named siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 22)",
        "(line 558,col 9)-(line 558,col 43)",
        "(line 559,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.matchesQName(org.w3c.dom.Node)",
      "begin_line": 568,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 580,
      "end_line": 590,
      "comment": "\n     * Get relative position of this among all siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 22)",
        "(line 582,col 9)-(line 582,col 43)",
        "(line 583,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 596,
      "end_line": 607,
      "comment": "\n     * Get the relative position of this among sibling text nodes.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 22)",
        "(line 598,col 9)-(line 598,col 43)",
        "(line 599,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI()",
      "begin_line": 613,
      "end_line": 625,
      "comment": "\n     * Get the relative position of this among same-target processing instruction siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 22)",
        "(line 615,col 9)-(line 615,col 67)",
        "(line 616,col 9)-(line 616,col 43)",
        "(line 617,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 627,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 640,
      "end_line": 649,
      "comment": "\n     * Get any prefix from the specified node.\n     * @param node the node to check\n     * @return String xml prefix\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 41)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 646,col 9)-(line 646,col 41)",
        "(line 647,col 9)-(line 647,col 42)",
        "(line 648,col 9)-(line 648,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 656,
      "end_line": 665,
      "comment": "\n     * Get the local name of the specified node.\n     * @param node node to check\n     * @return String local name\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 47)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 662,col 9)-(line 662,col 41)",
        "(line 663,col 9)-(line 663,col 42)",
        "(line 664,col 9)-(line 664,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 672,
      "end_line": 698,
      "comment": "\n     * Get the ns uri of the specified node.\n     * @param node Node to check\n     * @return String ns uri\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 675,col 9)",
        "(line 677,col 9)-(line 677,col 41)",
        "(line 679,col 9)-(line 679,col 47)",
        "(line 680,col 9)-(line 682,col 9)",
        "(line 684,col 9)-(line 684,col 40)",
        "(line 685,col 9)-(line 685,col 68)",
        "(line 687,col 9)-(line 687,col 26)",
        "(line 688,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 700,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 713,
      "end_line": 734,
      "comment": "\n     * Get the string value of the specified node.\n     * @param node Node to check\n     * @return String\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 42)",
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 85)",
        "(line 719,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 45)",
        "(line 728,col 9)-(line 728,col 46)",
        "(line 729,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 742,
      "end_line": 748,
      "comment": "\n     * Locates a node by ID.\n     * @param context starting context\n     * @param id to find\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 744,col 42)",
        "(line 745,col 9)-(line 745,col 54)",
        "(line 746,col 9)-(line 747,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 750,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 52)",
        "(line 753,col 9)-(line 753,col 52)",
        "(line 754,col 9)-(line 756,col 9)",
        "(line 758,col 9)-(line 758,col 37)",
        "(line 759,col 9)-(line 759,col 37)",
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 779,col 9)",
        "(line 781,col 9)-(line 781,col 44)",
        "(line 782,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 17)"
      ]
    }
  ]
}