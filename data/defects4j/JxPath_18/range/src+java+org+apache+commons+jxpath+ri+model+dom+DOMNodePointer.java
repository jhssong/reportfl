{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 54,
      "end_line": 919,
      "comment": "\n * A Pointer that points to a DOM node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.w3c.dom.Node, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 117,
      "end_line": 166,
      "comment": "\n     * Test a Node.\n     * @param node to test\n     * @param test to execute\n     * @return true if node passes test\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 174,
      "end_line": 181,
      "comment": "\n     * Test string equality.\n     * @param s1 String 1\n     * @param s2 String 2\n     * @return true if \u003d\u003d or .equals()\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 41)",
        "(line 179,col 9)-(line 179,col 41)",
        "(line 180,col 9)-(line 180,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName()",
      "begin_line": 186,
      "end_line": 198,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 25)",
        "(line 188,col 9)-(line 188,col 25)",
        "(line 189,col 9)-(line 189,col 38)",
        "(line 190,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 210,
      "end_line": 216,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceResolver()",
      "begin_line": 242,
      "end_line": 248,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 253,
      "end_line": 302,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 32)",
        "(line 267,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 301,col 9)-(line 301,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 307,
      "end_line": 329,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 380,
      "end_line": 384,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     * @param lang ns to test\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 39)",
        "(line 382,col 9)-(line 383,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)",
      "begin_line": 393,
      "end_line": 405,
      "comment": "\n     * Find the nearest occurrence of the specified attribute\n     * on the specified and enclosing elements.\n     * @param n current node\n     * @param attrName attribute name\n     * @return attribute value\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Get the language attribute for this node. \n     * @return String language name\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 422,
      "end_line": 464,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 469,
      "end_line": 499,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 483,col 23)",
        "(line 484,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 498,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 504,
      "end_line": 510,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 60)",
        "(line 508,col 9)-(line 508,col 28)",
        "(line 509,col 9)-(line 509,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 515,
      "end_line": 541,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 41)",
        "(line 520,col 9)-(line 520,col 41)",
        "(line 521,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 50)",
        "(line 539,col 9)-(line 539,col 26)",
        "(line 540,col 9)-(line 540,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 546,
      "end_line": 552,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 43)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 557,
      "end_line": 618,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 49)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(java.lang.String)",
      "begin_line": 625,
      "end_line": 652,
      "comment": "\n     * Return a string escaping single and double quotes.\n     * @param string string to treat\n     * @return string with any necessary changes made.\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 50)",
        "(line 627,col 9)-(line 627,col 65)",
        "(line 628,col 9)-(line 628,col 31)",
        "(line 629,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 651,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName()",
      "begin_line": 658,
      "end_line": 671,
      "comment": "\n     * Get relative position of this among like-named siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 22)",
        "(line 660,col 9)-(line 660,col 43)",
        "(line 661,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 677,
      "end_line": 687,
      "comment": "\n     * Get relative position of this among all siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 22)",
        "(line 679,col 9)-(line 679,col 43)",
        "(line 680,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 693,
      "end_line": 704,
      "comment": "\n     * Get the relative position of this among sibling text nodes.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 22)",
        "(line 695,col 9)-(line 695,col 43)",
        "(line 696,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI()",
      "begin_line": 710,
      "end_line": 722,
      "comment": "\n     * Get the relative position of this among same-target processing instruction siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 22)",
        "(line 712,col 9)-(line 712,col 67)",
        "(line 713,col 9)-(line 713,col 43)",
        "(line 714,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 727,
      "end_line": 729,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 743,
      "end_line": 752,
      "comment": "\n     * Get any prefix from the specified node.\n     * @param node the node to check\n     * @return String xml prefix\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 41)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 41)",
        "(line 750,col 9)-(line 750,col 42)",
        "(line 751,col 9)-(line 751,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 759,
      "end_line": 768,
      "comment": "\n     * Get the local name of the specified node.\n     * @param node node to check\n     * @return String local name\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 47)",
        "(line 761,col 9)-(line 763,col 9)",
        "(line 765,col 9)-(line 765,col 41)",
        "(line 766,col 9)-(line 766,col 42)",
        "(line 767,col 9)-(line 767,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 775,
      "end_line": 801,
      "comment": "\n     * Get the ns uri of the specified node.\n     * @param node Node to check\n     * @return String ns uri\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 778,col 9)",
        "(line 780,col 9)-(line 780,col 41)",
        "(line 782,col 9)-(line 782,col 47)",
        "(line 783,col 9)-(line 785,col 9)",
        "(line 787,col 9)-(line 787,col 40)",
        "(line 788,col 9)-(line 788,col 68)",
        "(line 790,col 9)-(line 790,col 26)",
        "(line 791,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 806,
      "end_line": 812,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 819,
      "end_line": 840,
      "comment": "\n     * Get the string value of the specified node.\n     * @param node Node to check\n     * @return String\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 42)",
        "(line 821,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 85)",
        "(line 825,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 833,col 45)",
        "(line 834,col 9)-(line 834,col 48)",
        "(line 835,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 848,
      "end_line": 854,
      "comment": "\n     * Locates a node by ID.\n     * @param context starting context\n     * @param id to find\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 850,col 42)",
        "(line 851,col 9)-(line 851,col 54)",
        "(line 852,col 9)-(line 853,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 861,
      "end_line": 870,
      "comment": "\n     * Get the AbstractFactory associated with the specified JXPathContext.\n     * @param context JXPathContext\n     * @return AbstractFactory\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 55)",
        "(line 863,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 875,
      "end_line": 918,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 52)",
        "(line 879,col 9)-(line 879,col 52)",
        "(line 880,col 9)-(line 882,col 9)",
        "(line 884,col 9)-(line 884,col 37)",
        "(line 885,col 9)-(line 885,col 37)",
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 905,col 9)",
        "(line 907,col 9)-(line 907,col 44)",
        "(line 908,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 17)"
      ]
    }
  ]
}