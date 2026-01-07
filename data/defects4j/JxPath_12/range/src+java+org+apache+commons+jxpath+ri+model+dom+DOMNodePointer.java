{
  "filepath": "/tmp/JxPath-12b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 53,
      "end_line": 727,
      "comment": "\n * A Pointer that points to a DOM node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaces"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultNamespace"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XML_NAMESPACE_URI"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XMLNS_NAMESPACE_URI"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.w3c.dom.Node, java.util.Locale)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 69,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.w3c.dom.Node, java.util.Locale, java.lang.String)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.DOMNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.w3c.dom.Node)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 22)",
        "(line 80,col 9)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(org.w3c.dom.Node, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 87,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 41)",
        "(line 143,col 9)-(line 143,col 41)",
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName()",
      "begin_line": 147,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 25)",
        "(line 150,col 9)-(line 150,col 38)",
        "(line 151,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 165,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 185,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 32)",
        "(line 199,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 42)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 233,col 9)-(line 233,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 236,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 289,
      "end_line": 293,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 39)",
        "(line 291,col 9)-(line 292,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)",
      "begin_line": 295,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 319,
      "end_line": 361,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 363,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 377,col 23)",
        "(line 378,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 392,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 395,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 60)",
        "(line 399,col 9)-(line 399,col 28)",
        "(line 400,col 9)-(line 400,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 403,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 41)",
        "(line 409,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 50)",
        "(line 423,col 9)-(line 423,col 26)",
        "(line 424,col 9)-(line 424,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 427,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 43)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 435,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 440,col 49)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(java.lang.String)",
      "begin_line": 499,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 41)",
        "(line 501,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 37)",
        "(line 509,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName()",
      "begin_line": 519,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 22)",
        "(line 521,col 9)-(line 521,col 43)",
        "(line 522,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 534,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 22)",
        "(line 536,col 9)-(line 536,col 43)",
        "(line 537,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 546,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 22)",
        "(line 548,col 9)-(line 548,col 43)",
        "(line 549,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 559,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 22)",
        "(line 561,col 9)-(line 561,col 43)",
        "(line 562,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 576,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 580,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 41)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 41)",
        "(line 587,col 9)-(line 587,col 42)",
        "(line 588,col 9)-(line 588,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 591,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 47)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 597,col 41)",
        "(line 598,col 9)-(line 598,col 42)",
        "(line 599,col 9)-(line 599,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 602,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 603,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 607,col 41)",
        "(line 609,col 9)-(line 609,col 47)",
        "(line 610,col 9)-(line 612,col 9)",
        "(line 614,col 9)-(line 614,col 40)",
        "(line 615,col 9)-(line 615,col 68)",
        "(line 617,col 9)-(line 617,col 26)",
        "(line 618,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 630,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 631,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 638,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 42)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 85)",
        "(line 644,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 45)",
        "(line 653,col 9)-(line 653,col 48)",
        "(line 654,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 664,
      "end_line": 670,
      "comment": "\n     * Locates a node by ID.\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 666,col 42)",
        "(line 667,col 9)-(line 667,col 54)",
        "(line 668,col 9)-(line 669,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 672,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 55)",
        "(line 674,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 683,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 52)",
        "(line 687,col 9)-(line 687,col 52)",
        "(line 688,col 9)-(line 690,col 9)",
        "(line 692,col 9)-(line 692,col 37)",
        "(line 693,col 9)-(line 693,col 37)",
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 713,col 9)",
        "(line 715,col 9)-(line 715,col 44)",
        "(line 716,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 17)"
      ]
    }
  ]
}