{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodePointer"
      ],
      "begin_line": 53,
      "end_line": 773,
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
        "(line 88,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 138,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName()",
      "begin_line": 154,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 25)",
        "(line 156,col 9)-(line 156,col 25)",
        "(line 157,col 9)-(line 157,col 38)",
        "(line 158,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer(java.lang.String)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 192,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 32)",
        "(line 206,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 42)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 240,col 9)-(line 240,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI()",
      "begin_line": 243,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(java.lang.String)",
      "begin_line": 296,
      "end_line": 302,
      "comment": "\n     * Returns true if the xml:lang attribute for the current node\n     * or its parent has the specified prefix \u003ci\u003elang\u003c/i\u003e.\n     * If no node has this prefix, calls \u003ccode\u003esuper.isLanguage(lang)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 39)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage()",
      "begin_line": 304,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 22)",
        "(line 306,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(java.lang.Object)",
      "begin_line": 325,
      "end_line": 367,
      "comment": "\n     * Sets contents of the node to the specified value. If the value is\n     * a String, the contents of the node are replaced with this text.\n     * If the value is an Element or Document, the children of the\n     * node are replaced with the children of the passed node.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 369,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 383,col 23)",
        "(line 384,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 399,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 402,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 60)",
        "(line 406,col 9)-(line 406,col 28)",
        "(line 407,col 9)-(line 407,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 410,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 41)",
        "(line 415,col 9)-(line 415,col 41)",
        "(line 416,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 50)",
        "(line 430,col 9)-(line 430,col 26)",
        "(line 431,col 9)-(line 431,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove()",
      "begin_line": 434,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 43)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath()",
      "begin_line": 442,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 447,col 49)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(java.lang.String)",
      "begin_line": 507,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 41)",
        "(line 509,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 37)",
        "(line 517,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName()",
      "begin_line": 527,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 22)",
        "(line 529,col 9)-(line 529,col 43)",
        "(line 530,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement()",
      "begin_line": 542,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 22)",
        "(line 544,col 9)-(line 544,col 43)",
        "(line 545,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode()",
      "begin_line": 554,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 22)",
        "(line 556,col 9)-(line 556,col 43)",
        "(line 557,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(java.lang.String)",
      "begin_line": 567,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 22)",
        "(line 569,col 9)-(line 569,col 43)",
        "(line 570,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode()",
      "begin_line": 580,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals(java.lang.Object)",
      "begin_line": 584,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 9)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 593,col 55)",
        "(line 594,col 9)-(line 594,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(org.w3c.dom.Node)",
      "begin_line": 597,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 41)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 603,col 41)",
        "(line 604,col 9)-(line 604,col 42)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(org.w3c.dom.Node)",
      "begin_line": 612,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 47)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 618,col 9)-(line 618,col 41)",
        "(line 619,col 9)-(line 619,col 42)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 624,col 9)-(line 624,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(org.w3c.dom.Node)",
      "begin_line": 627,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 630,col 9)",
        "(line 632,col 9)-(line 632,col 41)",
        "(line 634,col 9)-(line 634,col 47)",
        "(line 635,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 21)",
        "(line 640,col 9)-(line 640,col 40)",
        "(line 641,col 9)-(line 646,col 9)",
        "(line 648,col 9)-(line 648,col 26)",
        "(line 649,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue()",
      "begin_line": 661,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(org.w3c.dom.Node)",
      "begin_line": 665,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 42)",
        "(line 667,col 9)-(line 694,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 700,
      "end_line": 715,
      "comment": "\n     * Locates a node by ID.\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 26)",
        "(line 702,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 54)",
        "(line 709,col 9)-(line 714,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 717,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 55)",
        "(line 719,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 728,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 52)",
        "(line 732,col 9)-(line 732,col 52)",
        "(line 733,col 9)-(line 735,col 9)",
        "(line 737,col 9)-(line 737,col 37)",
        "(line 738,col 9)-(line 738,col 37)",
        "(line 739,col 9)-(line 758,col 9)",
        "(line 760,col 9)-(line 760,col 44)",
        "(line 761,col 9)-(line 769,col 9)",
        "(line 771,col 9)-(line 771,col 17)"
      ]
    }
  ]
}