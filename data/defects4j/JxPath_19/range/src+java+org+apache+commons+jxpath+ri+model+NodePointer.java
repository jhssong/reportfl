{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/NodePointer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 45,
      "end_line": 885,
      "comment": "\n * Common superclass for Pointers of all kinds.  A NodePointer maps to\n * a deterministic XPath that represents the location of a node in an\n * object graph. This XPath uses only simple axes: child, namespace and\n * attribute and only simple, context-independent predicates.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "WHOLE_COLLECTION"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Whole collection index. "
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_NAMESPACE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Constant to indicate unknown namespace "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Index for this NodePointer "
    },
    {
      "type": "field",
      "varNames": [
        "attribute"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceResolver"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootNode"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(org.apache.commons.jxpath.ri.QName, java.lang.Object, java.util.Locale)",
      "begin_line": 68,
      "end_line": 89,
      "comment": "\n     * Allocates an entirely new NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     * @param name QName\n     * @param bean Object\n     * @param locale Locale\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 35)",
        "(line 73,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 79,col 65)",
        "(line 80,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 88,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.QName, java.lang.Object)",
      "begin_line": 99,
      "end_line": 115,
      "comment": "\n     * Allocates an new child NodePointer by iterating through all installed\n     * NodePointerFactories until it finds one that can create a pointer.\n     * @param parent pointer\n     * @param name QName\n     * @param bean Object\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 104,col 65)",
        "(line 105,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Parent pointer "
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Locale "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Create a new NodePointer.\n     * @param parent Pointer\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.NodePointer(org.apache.commons.jxpath.ri.model.NodePointer, java.util.Locale)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Create a new NodePointer.\n     * @param parent Pointer\n     * @param locale Locale\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)",
        "(line 138,col 9)-(line 138,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceResolver()",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\n     * Get the NamespaceResolver associated with this NodePointer.\n     * @return NamespaceResolver\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "setNamespaceResolver(NamespaceResolver)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027NamespaceResolver\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Set the NamespaceResolver for this NodePointer.\n     * @param namespaceResolver NamespaceResolver\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getParent()",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\n     * Get the parent pointer.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 37)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateParentPointer()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Get the immediate parent pointer.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setAttribute(boolean)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Set to true if the pointer represents the \"attribute::\" axis.\n     * @param attribute boolean\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isAttribute()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Returns true if the pointer represents the \"attribute::\" axis.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isRoot()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Returns true if this Pointer has no parent.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLeaf()",
      "begin_line": 208,
      "end_line": 208,
      "comment": "\n     * If true, this node does not have children\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isNode()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Learn whether this pointer is considered to be a node.\n     * @return boolean\n     * @deprecated Please use !isContainer()\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isContainer()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * If true, this node is auxiliary and can only be used as an intermediate in\n     * the chain of pointers.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getIndex()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * If the pointer represents a collection, the index identifies\n     * an element of that collection.  The default value of \u003ccode\u003eindex\u003c/code\u003e\n     * is \u003ccode\u003eWHOLE_COLLECTION\u003c/code\u003e, which just means that the pointer\n     * is not indexed at all.\n     * Note: the index on NodePointer starts with 0, not 1.\n     * @return int\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setIndex(int)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Set the index of this NodePointer.\n     * @param index int\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isCollection()",
      "begin_line": 253,
      "end_line": 253,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the value of the pointer is an array or\n     * a Collection.\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLength()",
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n     * If the pointer represents a collection (or collection element),\n     * returns the length of the collection.\n     * Otherwise returns 1 (even if the value is null).\n     * @return int\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValue()",
      "begin_line": 269,
      "end_line": 276,
      "comment": "\n     * By default, returns \u003ccode\u003egetNode()\u003c/code\u003e, can be overridden to\n     * return a \"canonical\" value, like for instance a DOM element should\n     * return its string value.\n     * @return Object value\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 53)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer()",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\n     * If this pointer manages a transparent container, like a variable,\n     * this method returns the pointer to the contents.\n     * Only an auxiliary (non-node) pointer can (and should) return a\n     * value pointer other than itself.\n     * Note that you probably don\u0027t want to override\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e directly.  Override the\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e method instead.  The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method is calls\n     * \u003ccode\u003egetImmediateValuePointer()\u003c/code\u003e and, if the result is not\n     * \u003ccode\u003ethis\u003c/code\u003e, invokes \u003ccode\u003egetValuePointer()\u003c/code\u003e recursively.\n     * The idea here is to open all nested containers. Let\u0027s say we have a\n     * container within a container within a container. The\n     * \u003ccode\u003egetValuePointer()\u003c/code\u003e method should then open all those\n     * containers and return the pointer to the ultimate contents. It does so\n     * with the above recursion.\n     * @return NodePointer\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 53)",
        "(line 298,col 9)-(line 298,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateValuePointer()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * @see #getValuePointer()\n     *\n     * @return NodePointer is either \u003ccode\u003ethis\u003c/code\u003e or a pointer\n     *   for the immediately contained value.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isActual()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * An actual pointer points to an existing part of an object graph, even\n     * if it is null. A non-actual pointer represents a part that does not exist\n     * at all.\n     * For instance consider the pointer \"/address/street\".\n     * If both \u003cem\u003eaddress\u003c/em\u003e and \u003cem\u003estreet\u003c/em\u003e are not null,\n     * the pointer is actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is not null, but \u003cem\u003estreet\u003c/em\u003e is null,\n     * the pointer is still actual.\n     * If \u003cem\u003eaddress\u003c/em\u003e is null, the pointer is not actual.\n     * (In JavaBeans) if \u003cem\u003eaddress\u003c/em\u003e is not a property of the root bean,\n     * a Pointer for this path cannot be obtained at all - actual or otherwise.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getName()",
      "begin_line": 333,
      "end_line": 333,
      "comment": "\n     * Returns the name of this node. Can be null.\n     * @return QName\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getBaseValue()",
      "begin_line": 341,
      "end_line": 341,
      "comment": "\n     * Returns the value represented by the pointer before indexing.\n     * So, if the node represents an element of a collection, this\n     * method returns the collection itself.\n     * @return Object value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeValue()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     * @return Object node value\n     * @deprecated 1.1 Please use getNode()\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNode()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type. Opens containers, properties etc and returns\n     * the ultimate contents.\n     * @return Object node\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getRootNode()",
      "begin_line": 367,
      "end_line": 372,
      "comment": "\n     * Get the root node.\n     * @return Object value of this pointer\u0027s root (top parent).\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getImmediateNode()",
      "begin_line": 379,
      "end_line": 379,
      "comment": "\n     * Returns the object the pointer points to; does not convert it\n     * to a \"canonical\" type.\n     * @return Object node\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.setValue(java.lang.Object)",
      "begin_line": 386,
      "end_line": 386,
      "comment": "\n     * Converts the value to the required type and changes the corresponding\n     * object to that value.\n     * @param value the value to set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 395,
      "end_line": 396,
      "comment": "\n     * Compares two child NodePointers and returns a positive number,\n     * zero or a positive number according to the order of the pointers.\n     * @param pointer1 first pointer to be compared\n     * @param pointer2 second pointer to be compared\n     * @return int per Java comparison conventions\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 403,
      "end_line": 434,
      "comment": "\n     * Checks if this Pointer matches the supplied NodeTest.\n     * @param test the NodeTest to execute\n     * @return true if a match\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 433,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.equalStrings(java.lang.String, java.lang.String)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * Compare two strings, either of which may be null, for equality.\n     * @param s1 the first String to compare\n     * @param s2 the second String to compare\n     * @return true if both Strings are null, same or equal\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\n     *  Called directly by JXPathContext. Must create path and\n     *  set value.\n     *  @param context the owning JXPathContext\n     *  @param value the new value to set\n     *  @return created NodePointer\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 24)",
        "(line 455,col 9)-(line 455,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.remove()",
      "begin_line": 461,
      "end_line": 466,
      "comment": "\n     * Remove the node of the object graph this pointer points to.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object.\n     * Must create an object described by this pointer and return\n     * a new pointer that properly describes the new object.\n     * @param context the owning JXPathContext\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)",
      "begin_line": 490,
      "end_line": 498,
      "comment": "\n     * Called by a child pointer if that child needs to assign the value\n     * supplied in the createPath(context, value) call to a non-existent\n     * node. This method may have to expand the collection in order to assign\n     * the element.\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which a child should be created\n     * @param index child index.\n     * @param value node value to set\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)",
      "begin_line": 510,
      "end_line": 514,
      "comment": "\n     * Called by a child pointer when it needs to create a parent object for a\n     * non-existent collection element. It may have to expand the collection,\n     * then create an element object and return a new pointer describing the\n     * newly created element.\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which a child should be created\n     * @param index child index.\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 513,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)",
      "begin_line": 522,
      "end_line": 526,
      "comment": "\n     * Called to create a non-existing attribute\n     * @param context the owning JXPathCOntext\n     * @param name the QName at which an attribute should be created\n     * @return created NodePointer\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getLocale()",
      "begin_line": 533,
      "end_line": 538,
      "comment": "\n     * If the Pointer has a parent, returns the parent\u0027s locale; otherwise\n     * returns the locale specified when this Pointer was created.\n     * @return Locale for this NodePointer\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(java.lang.String)",
      "begin_line": 546,
      "end_line": 550,
      "comment": "\n     * Check whether our locale matches the specified language.\n     * @param lang String language to check\n     * @return true if the selected locale name starts\n     *              with the specified prefix \u003ci\u003elang\u003c/i\u003e, case-insensitive.\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 33)",
        "(line 548,col 9)-(line 548,col 55)",
        "(line 549,col 9)-(line 549,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 560,
      "end_line": 567,
      "comment": "\n     * Returns a NodeIterator that iterates over all children or all children\n     * that match the given NodeTest, starting with the specified one.\n     * @param test NodeTest to filter children\n     * @param reverse specified iteration direction\n     * @param startWith the NodePointer to start with\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 53)",
        "(line 565,col 9)-(line 566,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.attributeIterator(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 576,
      "end_line": 580,
      "comment": "\n     * Returns a NodeIterator that iterates over all attributes of the current\n     * node matching the supplied node name (could have a wildcard).\n     * May return null if the object does not support the attributes.\n     * @param qname the attribute name to test\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 53)",
        "(line 578,col 9)-(line 579,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespaceIterator()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "\n     * Returns a NodeIterator that iterates over all namespaces of the value\n     * currently pointed at.\n     * May return null if the object does not support the namespaces.\n     * @return NodeIterator\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.namespacePointer(java.lang.String)",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\n     * Returns a NodePointer for the specified namespace. Will return null\n     * if namespaces are not supported.\n     * Will return UNKNOWN_NAMESPACE if there is no such namespace.\n     * @param namespace incoming namespace\n     * @return NodePointer for \u003ccode\u003enamespace\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI(java.lang.String)",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n     * Decodes a namespace prefix to the corresponding URI.\n     * @param prefix prefix to decode\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNamespaceURI()",
      "begin_line": 616,
      "end_line": 618,
      "comment": "\n     * Returns the namespace URI associated with this Pointer.\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.isDefaultNamespace(java.lang.String)",
      "begin_line": 626,
      "end_line": 633,
      "comment": "\n     * Returns true if the supplied prefix represents the\n     * default namespace in the context of the current node.\n     * @param prefix the prefix to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if prefix is default\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 51)",
        "(line 632,col 9)-(line 632,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getDefaultNamespaceURI()",
      "begin_line": 639,
      "end_line": 641,
      "comment": "\n     * Get the default ns uri\n     * @return String uri\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\n     * Locates a node by ID.\n     * @param context JXPathContext owning context\n     * @param id String id\n     * @return Pointer found\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getPointerByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.String)",
      "begin_line": 660,
      "end_line": 665,
      "comment": "\n     * Locates a node by key and value.\n     * @param context owning JXPathContext\n     * @param key key to search for\n     * @param value value to match\n     * @return Pointer found\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getNodeSetByKey(org.apache.commons.jxpath.JXPathContext, java.lang.String, java.lang.Object)",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\n     * Find a NodeSet by key/value.\n     * @param context owning JXPathContext\n     * @param key key to search for\n     * @param value value to match\n     * @return NodeSet found\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.asPath()",
      "begin_line": 682,
      "end_line": 707,
      "comment": "\n     * Returns an XPath that maps to this Pointer.\n     * @return String xpath expression\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 689,col 49)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 694,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 33)",
        "(line 703,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.clone()",
      "begin_line": 713,
      "end_line": 726,
      "comment": "\n     * Clone this NodePointer.\n     * @return cloned NodePointer\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.toString()",
      "begin_line": 728,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareTo(java.lang.Object)",
      "begin_line": 732,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 9)",
        "(line 737,col 9)-(line 737,col 51)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 743,col 9)-(line 743,col 23)",
        "(line 744,col 9)-(line 744,col 30)",
        "(line 745,col 9)-(line 745,col 41)",
        "(line 746,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 42)",
        "(line 754,col 9)-(line 754,col 23)",
        "(line 755,col 9)-(line 755,col 33)",
        "(line 756,col 9)-(line 762,col 9)",
        "(line 764,col 9)-(line 764,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.compareNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, int, org.apache.commons.jxpath.ri.model.NodePointer, int)",
      "begin_line": 775,
      "end_line": 799,
      "comment": "\n     * Compare node pointers.\n     * @param p1 pointer 1\n     * @param depth1 depth 1\n     * @param p2 pointer 2\n     * @param depth2 depth 2\n     * @return comparison result: (\u003c 0) -\u003e (p1 lt p2); (0) -\u003e (p1 eq p2); (\u003e 0) -\u003e (p1 gt p2)\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 787,col 9)",
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 82)",
        "(line 798,col 9)-(line 798,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printPointerChain()",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\n     * Print internal structure of a pointer for debugging\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.escape(java.lang.String)",
      "begin_line": 813,
      "end_line": 841,
      "comment": "\n     * Return a string escaping single and double quotes.\n     * @param string string to treat\n     * @return string with any necessary changes made.\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 50)",
        "(line 815,col 9)-(line 815,col 65)",
        "(line 816,col 9)-(line 816,col 31)",
        "(line 817,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 848,
      "end_line": 856,
      "comment": "\n     * Get the AbstractFactory associated with the specified JXPathContext.\n     * @param context JXPathContext\n     * @return AbstractFactory\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 55)",
        "(line 850,col 9)-(line 854,col 9)",
        "(line 855,col 9)-(line 855,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.NodePointer.printDeep(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.String)",
      "begin_line": 863,
      "end_line": 884,
      "comment": "\n     * Print deep\n     * @param pointer to print\n     * @param indent indentation level\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 883,col 9)"
      ]
    }
  ]
}