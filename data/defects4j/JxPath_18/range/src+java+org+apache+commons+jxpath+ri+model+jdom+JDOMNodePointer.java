{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 51,
      "end_line": 936,
      "comment": "\n * A Pointer that points to a DOM node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localNamespaceResolver"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XML_NAMESPACE_URI"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " XML ns uri "
    },
    {
      "type": "field",
      "varNames": [
        "XMLNS_NAMESPACE_URI"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " XMLNS ns uri "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(java.lang.Object, java.util.Locale)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Create a new JDOMNodePointer.\n     * @param node pointed\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 28)",
        "(line 73,col 9)-(line 73,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(java.lang.Object, java.util.Locale, java.lang.String)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Create a new JDOMNodePointer.\n     * @param node pointed\n     * @param locale Locale\n     * @param id String id\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 28)",
        "(line 84,col 9)-(line 84,col 25)",
        "(line 85,col 9)-(line 85,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.JDOMNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Create a new JDOMNodePointer.\n     * @param parent NodePointer\n     * @param node pointed\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 22)",
        "(line 95,col 9)-(line 95,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(java.lang.Object)",
      "begin_line": 142,
      "end_line": 152,
      "comment": "\n     * Get the ns uri of the specified node.\n     * @param node Node to check\n     * @return String\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceResolver()",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 168,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 31)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 52)",
        "(line 183,col 9)-(line 183,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 189,
      "end_line": 242,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 47)",
        "(line 194,col 9)-(line 194,col 47)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 54)",
        "(line 230,col 9)-(line 230,col 37)",
        "(line 231,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getBaseValue()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isCollection()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLength()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf()",
      "begin_line": 268,
      "end_line": 276,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getName()",
      "begin_line": 281,
      "end_line": 295,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 25)",
        "(line 283,col 9)-(line 283,col 25)",
        "(line 284,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getImmediateNode()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue()",
      "begin_line": 307,
      "end_line": 334,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 29)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 106)",
        "(line 333,col 9)-(line 333,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 339,
      "end_line": 382,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(java.util.List)",
      "begin_line": 388,
      "end_line": 415,
      "comment": "\n     * Add the specified content to this element.\n     * @param content List\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 41)",
        "(line 390,col 9)-(line 390,col 35)",
        "(line 392,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 431,
      "end_line": 480,
      "comment": "\n     * Execute test against node on behalf of pointer. \n     * @param pointer Pointer\n     * @param node to test\n     * @param test to execute\n     * @return true if node passes test\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 488,
      "end_line": 495,
      "comment": "\n     * Learn whether two strings are \u003d\u003d or .equals()\n     * @param s1 string 1\n     * @param s2 string 2\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 41)",
        "(line 493,col 9)-(line 493,col 41)",
        "(line 494,col 9)-(line 494,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix(java.lang.Object)",
      "begin_line": 502,
      "end_line": 512,
      "comment": "\n     * Get the prefix from a given node.\n     * @param node to check\n     * @return String\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(java.lang.Object)",
      "begin_line": 519,
      "end_line": 527,
      "comment": "\n     * Get the local name of the specified node.\n     * @param node to check\n     * @return String local name\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 536,
      "end_line": 539,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     * @param lang to compare\n     * @return true if this element uses the specified language.\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 39)",
        "(line 538,col 9)-(line 538,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\n     * Get the language of this element.\n     * @return String language\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(java.lang.Object, java.lang.String, org.jdom.Namespace)",
      "begin_line": 557,
      "end_line": 569,
      "comment": "\n     * Find the nearest occurrence of the specified attribute\n     * on the specified and enclosing elements.\n     * @param n current node\n     * @param attrName attribute name\n     * @param ns Namespace\n     * @return attribute value\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(java.lang.Object)",
      "begin_line": 576,
      "end_line": 594,
      "comment": "\n     * Get the parent of the specified node.\n     * @param node to check\n     * @return parent Element\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 599,
      "end_line": 630,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 613,col 23)",
        "(line 614,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 635,
      "end_line": 641,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 60)",
        "(line 639,col 9)-(line 639,col 28)",
        "(line 640,col 9)-(line 640,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 646,
      "end_line": 674,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 9)",
        "(line 651,col 9)-(line 651,col 41)",
        "(line 652,col 9)-(line 652,col 41)",
        "(line 653,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 50)",
        "(line 672,col 9)-(line 672,col 26)",
        "(line 673,col 9)-(line 673,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove()",
      "begin_line": 679,
      "end_line": 685,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 42)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath()",
      "begin_line": 690,
      "end_line": 748,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 695,col 49)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.escape(java.lang.String)",
      "begin_line": 755,
      "end_line": 782,
      "comment": "\n     * Return a string escaping single and double quotes.\n     * @param string string to treat\n     * @return string with any necessary changes made.\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 50)",
        "(line 757,col 9)-(line 757,col 65)",
        "(line 758,col 9)-(line 758,col 31)",
        "(line 759,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName()",
      "begin_line": 788,
      "end_line": 811,
      "comment": "\n     * Get relative position of this among like-named siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 817,
      "end_line": 840,
      "comment": "\n     * Get relative position of this among all siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 53)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 22)",
        "(line 823,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 22)",
        "(line 830,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 846,
      "end_line": 869,
      "comment": "\n     * Get the relative position of this among sibling text nodes.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 23)",
        "(line 848,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 44)",
        "(line 858,col 9)-(line 858,col 22)",
        "(line 859,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI()",
      "begin_line": 875,
      "end_line": 896,
      "comment": "\n     * Get the relative position of this among same-target processing instruction siblings.\n     * @return 1..n\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 67)",
        "(line 877,col 9)-(line 877,col 78)",
        "(line 878,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 44)",
        "(line 882,col 9)-(line 882,col 22)",
        "(line 883,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode()",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equals(java.lang.Object)",
      "begin_line": 908,
      "end_line": 919,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 909,col 9)-(line 911,col 9)",
        "(line 913,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 917,col 57)",
        "(line 918,col 9)-(line 918,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 926,
      "end_line": 934,
      "comment": "\n     * Get the AbstractFactory associated with the specified JXPathContext.\n     * @param context JXPathContext\n     * @return AbstractFactory\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 55)",
        "(line 928,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 23)"
      ]
    }
  ]
}