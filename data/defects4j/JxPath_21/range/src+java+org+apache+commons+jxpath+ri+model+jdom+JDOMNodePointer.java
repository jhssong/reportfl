{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 50,
      "end_line": 820,
      "comment": "\n * A Pointer that points to a DOM node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localNamespaceResolver"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XML_NAMESPACE_URI"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": " XML ns uri "
    },
    {
      "type": "field",
      "varNames": [
        "XMLNS_NAMESPACE_URI"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " XMLNS ns uri "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(java.lang.Object, java.util.Locale)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Create a new JDOMNodePointer.\n     * @param node pointed\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 28)",
        "(line 72,col 9)-(line 72,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(java.lang.Object, java.util.Locale, java.lang.String)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n     * Create a new JDOMNodePointer.\n     * @param node pointed\n     * @param locale Locale\n     * @param id String id\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 28)",
        "(line 83,col 9)-(line 83,col 25)",
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Create a new JDOMNodePointer.\n     * @param parent NodePointer\n     * @param node pointed\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 94,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 97,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(java.lang.Object)",
      "begin_line": 125,
      "end_line": 135,
      "comment": "\n     * Get the ns uri of the specified node.\n     * @param node Node to check\n     * @return String\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceResolver()",
      "begin_line": 137,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 145,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 52)",
        "(line 160,col 9)-(line 160,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 163,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 47)",
        "(line 167,col 9)-(line 167,col 47)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 54)",
        "(line 203,col 9)-(line 203,col 37)",
        "(line 204,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getBaseValue()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isCollection()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLength()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf()",
      "begin_line": 229,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getName()",
      "begin_line": 239,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 25)",
        "(line 241,col 9)-(line 241,col 25)",
        "(line 242,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getImmediateNode()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue()",
      "begin_line": 259,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 29)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 106)",
        "(line 285,col 9)-(line 285,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 288,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(java.util.List)",
      "begin_line": 337,
      "end_line": 364,
      "comment": "\n     * Add the specified content to this element.\n     * @param content List\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 41)",
        "(line 339,col 9)-(line 339,col 35)",
        "(line 341,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 377,
      "end_line": 426,
      "comment": "\n     * Execute test against node on behalf of pointer.\n     * @param pointer Pointer\n     * @param node to test\n     * @param test to execute\n     * @return true if node passes test\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 434,
      "end_line": 441,
      "comment": "\n     * Learn whether two strings are \u003d\u003d or .equals()\n     * @param s1 string 1\n     * @param s2 string 2\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 41)",
        "(line 439,col 9)-(line 439,col 41)",
        "(line 440,col 9)-(line 440,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(java.lang.Object)",
      "begin_line": 448,
      "end_line": 458,
      "comment": "\n     * Get the prefix from a given node.\n     * @param node to check\n     * @return String\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(java.lang.Object)",
      "begin_line": 465,
      "end_line": 473,
      "comment": "\n     * Get the local name of the specified node.\n     * @param node to check\n     * @return String local name\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 482,
      "end_line": 486,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     * @param lang to compare\n     * @return true if this element uses the specified language.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 39)",
        "(line 484,col 9)-(line 485,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Get the language of this element.\n     * @return String language\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(java.lang.Object, java.lang.String, org.jdom.Namespace)",
      "begin_line": 504,
      "end_line": 516,
      "comment": "\n     * Find the nearest occurrence of the specified attribute\n     * on the specified and enclosing elements.\n     * @param n current node\n     * @param attrName attribute name\n     * @param ns Namespace\n     * @return attribute value\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(java.lang.Object)",
      "begin_line": 523,
      "end_line": 541,
      "comment": "\n     * Get the parent of the specified node.\n     * @param node to check\n     * @return parent Element\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 543,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 556,col 23)",
        "(line 557,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 572,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 575,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 60)",
        "(line 578,col 9)-(line 578,col 28)",
        "(line 579,col 9)-(line 579,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 582,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 585,col 9)",
        "(line 587,col 9)-(line 587,col 41)",
        "(line 588,col 9)-(line 588,col 41)",
        "(line 589,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 50)",
        "(line 608,col 9)-(line 608,col 26)",
        "(line 609,col 9)-(line 609,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove()",
      "begin_line": 612,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 42)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath()",
      "begin_line": 620,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 625,col 49)",
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 677,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByQName()",
      "begin_line": 684,
      "end_line": 706,
      "comment": "\n     * Get relative position of this among like-named siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.matchesQName(org.jdom.Element)",
      "begin_line": 708,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 722,
      "end_line": 745,
      "comment": "\n     * Get relative position of this among all siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 53)",
        "(line 724,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 22)",
        "(line 728,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 22)",
        "(line 735,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 751,
      "end_line": 774,
      "comment": "\n     * Get the relative position of this among sibling text nodes.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 23)",
        "(line 753,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 44)",
        "(line 763,col 9)-(line 763,col 22)",
        "(line 764,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 773,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI()",
      "begin_line": 780,
      "end_line": 801,
      "comment": "\n     * Get the relative position of this among same-target processing instruction siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 67)",
        "(line 782,col 9)-(line 782,col 78)",
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 786,col 44)",
        "(line 787,col 9)-(line 787,col 22)",
        "(line 788,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode()",
      "begin_line": 803,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equals(java.lang.Object)",
      "begin_line": 807,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 816,col 9)-(line 816,col 57)",
        "(line 817,col 9)-(line 817,col 34)"
      ]
    }
  ]
}