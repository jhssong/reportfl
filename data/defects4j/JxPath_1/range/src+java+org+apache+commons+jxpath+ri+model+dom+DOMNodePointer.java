{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 53,
      "end_line": 772,
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
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 137,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName()",
      "begin_line": 153,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 25)",
        "(line 155,col 9)-(line 155,col 25)",
        "(line 156,col 9)-(line 156,col 38)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 171,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 191,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 32)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 42)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 239,col 9)-(line 239,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 242,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 263,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 295,
      "end_line": 301,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 39)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 303,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 22)",
        "(line 305,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 324,
      "end_line": 366,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 368,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 382,col 23)",
        "(line 383,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 401,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 60)",
        "(line 405,col 9)-(line 405,col 28)",
        "(line 406,col 9)-(line 406,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 409,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 41)",
        "(line 414,col 9)-(line 414,col 41)",
        "(line 415,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 50)",
        "(line 429,col 9)-(line 429,col 26)",
        "(line 430,col 9)-(line 430,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 433,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 43)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 441,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 446,col 49)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(java.lang.String)",
      "begin_line": 506,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 41)",
        "(line 508,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 37)",
        "(line 516,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName()",
      "begin_line": 526,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 22)",
        "(line 528,col 9)-(line 528,col 43)",
        "(line 529,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 541,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 22)",
        "(line 543,col 9)-(line 543,col 43)",
        "(line 544,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 553,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 22)",
        "(line 555,col 9)-(line 555,col 43)",
        "(line 556,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 566,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 22)",
        "(line 568,col 9)-(line 568,col 43)",
        "(line 569,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 579,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 583,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 592,col 55)",
        "(line 593,col 9)-(line 593,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 596,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 41)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 41)",
        "(line 603,col 9)-(line 603,col 42)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 611,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 47)",
        "(line 613,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 617,col 41)",
        "(line 618,col 9)-(line 618,col 42)",
        "(line 619,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 623,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 626,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 41)",
        "(line 633,col 9)-(line 633,col 47)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 21)",
        "(line 639,col 9)-(line 639,col 40)",
        "(line 640,col 9)-(line 645,col 9)",
        "(line 647,col 9)-(line 647,col 26)",
        "(line 648,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 660,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 664,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 42)",
        "(line 666,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 699,
      "end_line": 714,
      "comment": "\n     * Locates a node by ID.\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 26)",
        "(line 701,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 54)",
        "(line 708,col 9)-(line 713,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 716,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 55)",
        "(line 718,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 724,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 727,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 52)",
        "(line 731,col 9)-(line 731,col 52)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 736,col 9)-(line 736,col 37)",
        "(line 737,col 9)-(line 737,col 37)",
        "(line 738,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 759,col 44)",
        "(line 760,col 9)-(line 768,col 9)",
        "(line 770,col 9)-(line 770,col 17)"
      ]
    }
  ]
}