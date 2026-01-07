{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 54,
      "end_line": 745,
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
      "begin_line": 64,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XMLNS_NAMESPACE_URI"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.w3c.dom.Node, java.util.Locale)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)",
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.w3c.dom.Node, java.util.Locale, java.lang.String)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 28)",
        "(line 76,col 9)-(line 76,col 25)",
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.w3c.dom.Node)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 22)",
        "(line 82,col 9)-(line 82,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.w3c.dom.Node, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 89,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 41)",
        "(line 146,col 9)-(line 146,col 41)",
        "(line 147,col 9)-(line 147,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName()",
      "begin_line": 150,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 25)",
        "(line 152,col 9)-(line 152,col 25)",
        "(line 153,col 9)-(line 153,col 38)",
        "(line 154,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 168,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceResolver()",
      "begin_line": 191,
      "end_line": 197,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.jxpath.ri.model.NodePointer#getNamespaceResolver()\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 199,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 32)",
        "(line 213,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 42)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 247,col 9)-(line 247,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 250,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 303,
      "end_line": 307,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 39)",
        "(line 305,col 9)-(line 306,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)",
      "begin_line": 309,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 333,
      "end_line": 375,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 377,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 391,col 23)",
        "(line 392,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 406,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 409,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 60)",
        "(line 413,col 9)-(line 413,col 28)",
        "(line 414,col 9)-(line 414,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 417,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 41)",
        "(line 422,col 9)-(line 422,col 41)",
        "(line 423,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 50)",
        "(line 441,col 9)-(line 441,col 26)",
        "(line 442,col 9)-(line 442,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 445,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 43)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 453,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 49)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(java.lang.String)",
      "begin_line": 517,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 41)",
        "(line 519,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 37)",
        "(line 527,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName()",
      "begin_line": 537,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 22)",
        "(line 539,col 9)-(line 539,col 43)",
        "(line 540,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 552,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 22)",
        "(line 554,col 9)-(line 554,col 43)",
        "(line 555,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 564,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 22)",
        "(line 566,col 9)-(line 566,col 43)",
        "(line 567,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 577,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 22)",
        "(line 579,col 9)-(line 579,col 43)",
        "(line 580,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 590,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 594,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 598,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 41)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 41)",
        "(line 605,col 9)-(line 605,col 42)",
        "(line 606,col 9)-(line 606,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 609,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 47)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 615,col 41)",
        "(line 616,col 9)-(line 616,col 42)",
        "(line 617,col 9)-(line 617,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 620,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 625,col 41)",
        "(line 627,col 9)-(line 627,col 47)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 632,col 9)-(line 632,col 40)",
        "(line 633,col 9)-(line 633,col 68)",
        "(line 635,col 9)-(line 635,col 26)",
        "(line 636,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 648,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 656,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 42)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 85)",
        "(line 662,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 45)",
        "(line 671,col 9)-(line 671,col 48)",
        "(line 672,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 682,
      "end_line": 688,
      "comment": "\n     * Locates a node by ID.\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 684,col 42)",
        "(line 685,col 9)-(line 685,col 54)",
        "(line 686,col 9)-(line 687,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 690,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 55)",
        "(line 692,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 701,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 52)",
        "(line 705,col 9)-(line 705,col 52)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 710,col 37)",
        "(line 711,col 9)-(line 711,col 37)",
        "(line 712,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 731,col 9)",
        "(line 733,col 9)-(line 733,col 44)",
        "(line 734,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 17)"
      ]
    }
  ]
}