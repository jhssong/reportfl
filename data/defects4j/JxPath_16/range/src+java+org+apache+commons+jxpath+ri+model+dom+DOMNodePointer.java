{
  "filepath": "/tmp/JxPath-16b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 54,
      "end_line": 920,
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
      "end_line": 167,
      "comment": "\n     * Test a Node.\n     * @param node to test\n     * @param test to execute\n     * @return true if node passes test\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 175,
      "end_line": 182,
      "comment": "\n     * Test string equality.\n     * @param s1 String 1\n     * @param s2 String 2\n     * @return true if \u003d\u003d or .equals()\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 41)",
        "(line 180,col 9)-(line 180,col 41)",
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName()",
      "begin_line": 187,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 25)",
        "(line 189,col 9)-(line 189,col 25)",
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 211,
      "end_line": 217,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceResolver()",
      "begin_line": 243,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 254,
      "end_line": 303,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 32)",
        "(line 268,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 302,col 9)-(line 302,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 308,
      "end_line": 330,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 381,
      "end_line": 385,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     * @param lang ns to test\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 39)",
        "(line 383,col 9)-(line 384,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)",
      "begin_line": 394,
      "end_line": 406,
      "comment": "\n     * Find the nearest occurrence of the specified attribute\n     * on the specified and enclosing elements.\n     * @param n current node\n     * @param attrName attribute name\n     * @return attribute value\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Get the language attribute for this node. \n     * @return String language name\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 423,
      "end_line": 465,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 470,
      "end_line": 500,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 484,col 23)",
        "(line 485,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 499,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 505,
      "end_line": 511,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 60)",
        "(line 509,col 9)-(line 509,col 28)",
        "(line 510,col 9)-(line 510,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 516,
      "end_line": 542,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 41)",
        "(line 521,col 9)-(line 521,col 41)",
        "(line 522,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 50)",
        "(line 540,col 9)-(line 540,col 26)",
        "(line 541,col 9)-(line 541,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 547,
      "end_line": 553,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 43)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 558,
      "end_line": 619,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 563,col 9)-(line 563,col 49)",
        "(line 564,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 618,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(java.lang.String)",
      "begin_line": 626,
      "end_line": 653,
      "comment": "\n     * Return a string escaping single and double quotes.\n     * @param string string to treat\n     * @return string with any necessary changes made.\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 50)",
        "(line 628,col 9)-(line 628,col 65)",
        "(line 629,col 9)-(line 629,col 31)",
        "(line 630,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName()",
      "begin_line": 659,
      "end_line": 672,
      "comment": "\n     * Get relative position of this among like-named siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 22)",
        "(line 661,col 9)-(line 661,col 43)",
        "(line 662,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 678,
      "end_line": 688,
      "comment": "\n     * Get relative position of this among all siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 22)",
        "(line 680,col 9)-(line 680,col 43)",
        "(line 681,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 694,
      "end_line": 705,
      "comment": "\n     * Get the relative position of this among sibling text nodes.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 22)",
        "(line 696,col 9)-(line 696,col 43)",
        "(line 697,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI()",
      "begin_line": 711,
      "end_line": 723,
      "comment": "\n     * Get the relative position of this among same-target processing instruction siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 22)",
        "(line 713,col 9)-(line 713,col 67)",
        "(line 714,col 9)-(line 714,col 43)",
        "(line 715,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 722,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 728,
      "end_line": 730,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 735,
      "end_line": 737,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 744,
      "end_line": 753,
      "comment": "\n     * Get any prefix from the specified node.\n     * @param node the node to check\n     * @return String xml prefix\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 41)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 750,col 9)-(line 750,col 41)",
        "(line 751,col 9)-(line 751,col 42)",
        "(line 752,col 9)-(line 752,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 760,
      "end_line": 769,
      "comment": "\n     * Get the local name of the specified node.\n     * @param node node to check\n     * @return String local name\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 47)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 766,col 41)",
        "(line 767,col 9)-(line 767,col 42)",
        "(line 768,col 9)-(line 768,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 776,
      "end_line": 802,
      "comment": "\n     * Get the ns uri of the specified node.\n     * @param node Node to check\n     * @return String ns uri\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 779,col 9)",
        "(line 781,col 9)-(line 781,col 41)",
        "(line 783,col 9)-(line 783,col 47)",
        "(line 784,col 9)-(line 786,col 9)",
        "(line 788,col 9)-(line 788,col 40)",
        "(line 789,col 9)-(line 789,col 68)",
        "(line 791,col 9)-(line 791,col 26)",
        "(line 792,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 807,
      "end_line": 813,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 820,
      "end_line": 841,
      "comment": "\n     * Get the string value of the specified node.\n     * @param node Node to check\n     * @return String\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 42)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 85)",
        "(line 826,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 45)",
        "(line 835,col 9)-(line 835,col 48)",
        "(line 836,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 849,
      "end_line": 855,
      "comment": "\n     * Locates a node by ID.\n     * @param context starting context\n     * @param id to find\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 851,col 42)",
        "(line 852,col 9)-(line 852,col 54)",
        "(line 853,col 9)-(line 854,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 862,
      "end_line": 871,
      "comment": "\n     * Get the AbstractFactory associated with the specified JXPathContext.\n     * @param context JXPathContext\n     * @return AbstractFactory\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 55)",
        "(line 864,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 876,
      "end_line": 919,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 52)",
        "(line 880,col 9)-(line 880,col 52)",
        "(line 881,col 9)-(line 883,col 9)",
        "(line 885,col 9)-(line 885,col 37)",
        "(line 886,col 9)-(line 886,col 37)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 906,col 9)",
        "(line 908,col 9)-(line 908,col 44)",
        "(line 909,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 17)"
      ]
    }
  ]
}