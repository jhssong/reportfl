{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/model/NodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 47,
      "end_line": 942,
      "comment": "\n * Common superclass for Pointers of all kinds.  A NodePointer maps to\n * a deterministic XPath that represents the location of a node in an\n * object graph. This XPath uses only simple axes: child, namespace and\n * attribute and only simple, context-independent predicates.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "WHOLE_COLLECTION"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Whole collection index. "
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_NAMESPACE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Constant to indicate unknown namespace "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Index for this NodePointer "
    },
    {
      "type": "field",
      "varNames": [
        "attribute"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceResolver"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exceptionHandler"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootNode"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 74,
      "end_line": 95,
      "comment": "\n     * Allocates an entirely new NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     * @param name QName\n     * @param bean Object\n     * @param locale Locale\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 35)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 85,col 65)",
        "(line 86,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 94,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 105,
      "end_line": 121,
      "comment": "\n     * Allocates an new child NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     * @param parent pointer\n     * @param name QName\n     * @param bean Object\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 110,col 65)",
        "(line 111,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Parent pointer "
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Locale "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Create a new NodePointer.\n     * @param parent Pointer\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.util.Locale)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * Create a new NodePointer.\n     * @param parent Pointer\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 29)",
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceResolver()",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\n     * Get the NamespaceResolver associated with this NodePointer.\n     * @return NamespaceResolver\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "setNamespaceResolver(NamespaceResolver)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027NamespaceResolver\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Set the NamespaceResolver for this NodePointer.\n     * @param namespaceResolver NamespaceResolver\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getParent()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Get the parent pointer.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 37)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateParentPointer()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Get the immediate parent pointer.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setAttribute(boolean)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Set to true if the pointer represents the \"attribute::\" axis.\n     * @param attribute boolean\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isAttribute()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Returns true if the pointer represents the \"attribute::\" axis.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isRoot()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Returns true if this Pointer has no parent.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLeaf()",
      "begin_line": 214,
      "end_line": 214,
      "comment": "\n     * If true, this node does not have children\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isNode()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * Learn whether this pointer is considered to be a node.\n     * @return boolean\n     * @deprecated Please use !isContainer()\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isContainer()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * If true, this node is auxiliary and can only be used as an intermediate in\n     * the chain of pointers.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getIndex()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * If the pointer represents a collection, the index identifies\n     * an element of that collection.  The default value of \u003ccode\u003eindex\u003c/code\u003e\n     * is \u003ccode\u003eWHOLE_COLLECTION\u003c/code\u003e, which just means that the pointer\n     * is not indexed at all.\n     * Note: the index on NodePointer starts with 0, not 1.\n     * @return int\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setIndex(int)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Set the index of this NodePointer.\n     * @param index int\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isCollection()",
      "begin_line": 259,
      "end_line": 259,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the value of the pointer is an array or\n     * a Collection.\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLength()",
      "begin_line": 267,
      "end_line": 267,
      "comment": "\n     * If the pointer represents a collection (or collection element),\n     * returns the length of the collection.\n     * Otherwise returns 1 (even if the value is null).\n     * @return int\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValue()",
      "begin_line": 275,
      "end_line": 282,
      "comment": "\n     * By default, returns \u003ccode\u003egetNode()\u003c/code\u003e, can be overridden to\n     * return a \"canonical\" value, like for instance a DOM element should\n     * return its string value.\n     * @return Object value\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 53)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 281,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer()",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * If this pointer manages a transparent container, like a variable,\n     * this method returns the pointer to the contents.\n     * Only an auxiliary (non-node) pointer can (and should) return a\n     * value pointer other than itself.\n     * Note that you probably don\u0027t want to override\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e directly.  Override the\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e method instead.  The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method is calls\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e and, if the result is not\n     * \u003ccode\u003ethis\u003c/code\u003e, invokes \u003ccode\u003egetValuePointer()\u003c/code\u003e recursively.\n     * The idea here is to open all nested containers. Let\u0027s say we have a\n     * container within a container within a container. The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method should then open all those\n     * containers and return the pointer to the ultimate contents. It does so\n     * with the above recursion.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 53)",
        "(line 304,col 9)-(line 304,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateValuePointer()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * @see #getValuePointer()\n     *\n     * @return NodePointer is either \u003ccode\u003ethis\u003c/code\u003e or a pointer\n     *   for the immediately contained value.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isActual()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * An actual pointer points to an existing part of an object graph, even\n     * if it is null. A non-actual pointer represents a part that does not exist\n     * at all.\n     * For instance consider the pointer \"/address/street\".\n     * If both \u003cem\u003eaddress\u003c/em\u003e and \u003cem\u003estreet\u003c/em\u003e are not null,\n     * the pointer is actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is not null, but \u003cem\u003estreet\u003c/em\u003e is null,\n     * the pointer is still actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is null, the pointer is not actual.\n     * (In JavaBeans) if \u003cem\u003eaddress\u003c/em\u003e is not a property of the root bean,\n     * a Pointer for this path cannot be obtained at all - actual or otherwise.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getName()",
      "begin_line": 339,
      "end_line": 339,
      "comment": "\n     * Returns the name of this node. Can be null.\n     * @return QName\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getBaseValue()",
      "begin_line": 347,
      "end_line": 347,
      "comment": "\n     * Returns the value represented by the pointer before indexing.\n     * So, if the node represents an element of a collection, this\n     * method returns the collection itself.\n     * @return Object value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeValue()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     * @return Object node value\n     * @deprecated 1.1 Please use getNode()\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNode()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type. Opens containers, properties etc and returns\n     * the ultimate contents.\n     * @return Object node\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getRootNode()",
      "begin_line": 373,
      "end_line": 378,
      "comment": "\n     * Get the root node.\n     * @return Object value of this pointer\u0027s root (top parent).\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateNode()",
      "begin_line": 385,
      "end_line": 385,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     * @return Object node\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setValue(java.lang.Object)",
      "begin_line": 392,
      "end_line": 392,
      "comment": "\n     * Converts the value to the required type and changes the corresponding\n     * object to that value.\n     * @param value the value to set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 401,
      "end_line": 402,
      "comment": "\n     * Compares two child NodePointers and returns a positive number,\n     * zero or a positive number according to the order of the pointers.\n     * @param pointer1 first pointer to be compared\n     * @param pointer2 second pointer to be compared\n     * @return int per Java comparison conventions\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 409,
      "end_line": 440,
      "comment": "\n     * Checks if this Pointer matches the supplied NodeTest.\n     * @param test the NodeTest to execute\n     * @return true if a match\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 439,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 449,
      "end_line": 452,
      "comment": "\n     *  Called directly by JXPathContext. Must create path and\n     *  set value.\n     *  @param context the owning JXPathContext\n     *  @param value the new value to set\n     *  @return created NodePointer\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 24)",
        "(line 451,col 9)-(line 451,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.remove()",
      "begin_line": 457,
      "end_line": 462,
      "comment": "\n     * Remove the node of the object graph this pointer points to.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object.\n     * Must create an object described by this pointer and return\n     * a new pointer that properly describes the new object.\n     * @param context the owning JXPathContext\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 486,
      "end_line": 494,
      "comment": "\n     * Called by a child pointer if that child needs to assign the value\n     * supplied in the createPath(context, value) call to a non-existent\n     * node. This method may have to expand the collection in order to assign\n     * the element.\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which a child should be created\n     * @param index child index.\n     * @param value node value to set\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 493,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 506,
      "end_line": 510,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object for a\n     * non-existent collection element. It may have to expand the collection,\n     * then create an element object and return a new pointer describing the\n     * newly created element.\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which a child should be created\n     * @param index child index.\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 509,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 518,
      "end_line": 522,
      "comment": "\n     * Called to create a non-existing attribute\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which an attribute should be created\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLocale()",
      "begin_line": 529,
      "end_line": 534,
      "comment": "\n     * If the Pointer has a parent, returns the parent\u0027s locale; otherwise\n     * returns the locale specified when this Pointer was created.\n     * @return Locale for this NodePointer\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(java.lang.String)",
      "begin_line": 542,
      "end_line": 546,
      "comment": "\n     * Check whether our locale matches the specified language.\n     * @param lang String language to check\n     * @return true if the selected locale name starts\n     *              with the specified prefix \u003ci\u003elang\u003c/i\u003e, case-insensitive.\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 33)",
        "(line 544,col 9)-(line 544,col 55)",
        "(line 545,col 9)-(line 545,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 556,
      "end_line": 563,
      "comment": "\n     * Returns a NodeIterator that iterates over all children or all children\n     * that match the given NodeTest, starting with the specified one.\n     * @param test NodeTest to filter children\n     * @param reverse specified iteration direction\n     * @param startWith the NodePointer to start with\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 53)",
        "(line 561,col 9)-(line 562,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 572,
      "end_line": 576,
      "comment": "\n     * Returns a NodeIterator that iterates over all attributes of the current\n     * node matching the supplied node name (could have a wildcard).\n     * May return null if the object does not support the attributes.\n     * @param qname the attribute name to test\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 53)",
        "(line 574,col 9)-(line 575,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespaceIterator()",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Returns a NodeIterator that iterates over all namespaces of the value\n     * currently pointed at.\n     * May return null if the object does not support the namespaces.\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespacePointer(java.lang.String)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * Returns a NodePointer for the specified namespace. Will return null\n     * if namespaces are not supported.\n     * Will return UNKNOWN_NAMESPACE if there is no such namespace.\n     * @param namespace incoming namespace\n     * @return NodePointer for \u003ccode\u003enamespace\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n     * Decodes a namespace prefix to the corresponding URI.\n     * @param prefix prefix to decode\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI()",
      "begin_line": 612,
      "end_line": 614,
      "comment": "\n     * Returns the namespace URI associated with this Pointer.\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isDefaultNamespace(java.lang.String)",
      "begin_line": 622,
      "end_line": 629,
      "comment": "\n     * Returns true if the supplied prefix represents the\n     * default namespace in the context of the current node.\n     * @param prefix the prefix to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if prefix is default\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 625,col 9)",
        "(line 627,col 9)-(line 627,col 51)",
        "(line 628,col 9)-(line 628,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getDefaultNamespaceURI()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n     * Get the default ns uri\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n     * Locates a node by ID.\n     * @param context JXPathContext owning context\n     * @param id String id\n     * @return Pointer found\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String)",
      "begin_line": 656,
      "end_line": 661,
      "comment": "\n     * Locates a node by key and value.\n     * @param context owning JXPathContext\n     * @param key key to search for\n     * @param value value to match\n     * @return Pointer found\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeSetByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.Object)",
      "begin_line": 670,
      "end_line": 672,
      "comment": "\n     * Find a NodeSet by key/value.\n     * @param context owning JXPathContext\n     * @param key key to search for\n     * @param value value to match\n     * @return NodeSet found\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.asPath()",
      "begin_line": 678,
      "end_line": 703,
      "comment": "\n     * Returns an XPath that maps to this Pointer.\n     * @return String xpath expression\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 685,col 9)-(line 685,col 49)",
        "(line 686,col 9)-(line 688,col 9)",
        "(line 690,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 33)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.clone()",
      "begin_line": 709,
      "end_line": 722,
      "comment": "\n     * Clone this NodePointer.\n     * @return cloned NodePointer\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.toString()",
      "begin_line": 724,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareTo(java.lang.Object)",
      "begin_line": 728,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 731,col 9)",
        "(line 733,col 9)-(line 733,col 51)",
        "(line 734,col 9)-(line 736,col 9)",
        "(line 739,col 9)-(line 739,col 23)",
        "(line 740,col 9)-(line 740,col 30)",
        "(line 741,col 9)-(line 741,col 41)",
        "(line 742,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 42)",
        "(line 750,col 9)-(line 750,col 23)",
        "(line 751,col 9)-(line 751,col 33)",
        "(line 752,col 9)-(line 758,col 9)",
        "(line 760,col 9)-(line 760,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, int, org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 771,
      "end_line": 795,
      "comment": "\n     * Compare node pointers.\n     * @param p1 pointer 1\n     * @param depth1 depth 1\n     * @param p2 pointer 2\n     * @param depth2 depth 2\n     * @return comparison result: (\u003c 0) -\u003e (p1 lt p2); (0) -\u003e (p1 eq p2); (\u003e 0) -\u003e (p1 gt p2)\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 783,col 9)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 82)",
        "(line 794,col 9)-(line 794,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printPointerChain()",
      "begin_line": 800,
      "end_line": 802,
      "comment": "\n     * Print internal structure of a pointer for debugging\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setExceptionHandler(org.apache.commons.jxpath.ExceptionHandler)",
      "begin_line": 808,
      "end_line": 810,
      "comment": "\n     * Set the exceptionHandler of this NodePointer.\n     * @param exceptionHandler the ExceptionHandler to set\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.handle(java.lang.Throwable, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 818,
      "end_line": 826,
      "comment": "\n     * Handle a Throwable using an installed ExceptionHandler, if available.\n     * Public to facilitate calling for RI support; not truly intended for public consumption.\n     * @param t to handle\n     * @param originator context\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 825,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.handle(java.lang.Throwable)",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * Handle a Throwable using an installed ExceptionHandler, if available.\n     * Public to facilitate calling for RI support; not truly intended for public consumption.\n     * @param t to handle\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.escape(java.lang.String)",
      "begin_line": 842,
      "end_line": 870,
      "comment": "\n     * Return a string escaping single and double quotes.\n     * @param string string to treat\n     * @return string with any necessary changes made.\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 50)",
        "(line 844,col 9)-(line 844,col 65)",
        "(line 845,col 9)-(line 845,col 31)",
        "(line 846,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 877,
      "end_line": 885,
      "comment": "\n     * Get the AbstractFactory associated with the specified JXPathContext.\n     * @param context JXPathContext\n     * @return AbstractFactory\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 55)",
        "(line 879,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printDeep(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 892,
      "end_line": 913,
      "comment": "\n     * Print deep\n     * @param pointer to print\n     * @param indent indentation level\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 909,col 9)",
        "(line 910,col 9)-(line 912,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.safeEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 915,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.verify(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 925,
      "end_line": 941,
      "comment": "\n     * Verify the structure of a given NodePointer.\n     * @param nodePointer\n     * @return nodePointer\n     * @throws JXPathNotFoundException\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 940,col 27)"
      ]
    }
  ]
}