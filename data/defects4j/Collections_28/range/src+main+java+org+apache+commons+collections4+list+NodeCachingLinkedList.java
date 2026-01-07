{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/list/NodeCachingLinkedList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeCachingLinkedList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractLinkedList\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 244,
      "comment": "\n * A \u003ccode\u003eList\u003c/code\u003e implementation that stores a cache of internal Node objects\n * in an effort to reduce wasteful object creation.\n * \u003cp\u003e\n * A linked list creates one Node for each item of data added. This can result in\n * a lot of object creation and garbage collection. This implementation seeks to\n * avoid that by maintaining a store of cached nodes.\n * \u003cp\u003e\n * This implementation is suitable for long-lived lists where both add and remove\n * are used. Short-lived lists, or lists which only grow will have worse performance\n * using this class.\n * \u003cp\u003e\n * \u003cb\u003eNote that this implementation is not synchronized.\u003c/b\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMUM_CACHE_SIZE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The default value for {@link #maximumCacheSize}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "firstCachedNode"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * The first cached node, or \u003ccode\u003enull\u003c/code\u003e if no nodes are cached.\n     * Cached nodes are stored in a singly-linked list with\n     * \u003ccode\u003enext\u003c/code\u003e pointing to the next element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cacheSize"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * The size of the cache.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumCacheSize"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * The maximum size of the cache.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.NodeCachingLinkedList()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructor that creates.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.NodeCachingLinkedList(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Constructor that copies the specified collection\n     *\n     * @param coll  the collection to copy\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 20)",
        "(line 84,col 9)-(line 84,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.NodeCachingLinkedList(int)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Constructor that species the maximum cache size.\n     *\n     * @param maximumCacheSize  the maximum cache size\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 16)",
        "(line 94,col 9)-(line 94,col 49)",
        "(line 95,col 9)-(line 95,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.getMaximumCacheSize()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Gets the maximum size of the cache.\n     *\n     * @return the maximum cache size\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.setMaximumCacheSize(int)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Sets the maximum size of the cache.\n     *\n     * @param maximumCacheSize  the new maximum cache size\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 49)",
        "(line 115,col 9)-(line 115,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.shrinkCacheToMaximumSize()",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n     * Reduce the size of the cache to the maximum, if necessary.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.getNodeFromCache()",
      "begin_line": 135,
      "end_line": 145,
      "comment": "\n     * Gets a node from the cache. If a node is returned, then the value of\n     * {@link #cacheSize} is decreased accordingly. The node that is returned\n     * will have \u003ccode\u003enull\u003c/code\u003e values for next, previous and element.\n     *\n     * @return a node, or \u003ccode\u003enull\u003c/code\u003e if there are no nodes in the cache.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 140,col 42)",
        "(line 141,col 9)-(line 141,col 31)",
        "(line 143,col 9)-(line 143,col 20)",
        "(line 144,col 9)-(line 144,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.isCacheFull()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Checks whether the cache is full.\n     *\n     * @return true if the cache is full\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.addNodeToCache(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 162,
      "end_line": 174,
      "comment": "\n     * Adds a node to the cache, if the cache isn\u0027t full.\n     * The node\u0027s contents are cleared to so they can be garbage collected.\n     *\n     * @param node  the node to add to the cache\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 55)",
        "(line 169,col 9)-(line 169,col 29)",
        "(line 170,col 9)-(line 170,col 35)",
        "(line 171,col 9)-(line 171,col 28)",
        "(line 172,col 9)-(line 172,col 31)",
        "(line 173,col 9)-(line 173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.createNode(E)",
      "begin_line": 184,
      "end_line": 192,
      "comment": "\n     * Creates a new node, either by reusing one from the cache or creating\n     * a new one.\n     *\n     * @param value  value of the new node\n     * @return the newly created node\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 54)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 35)",
        "(line 191,col 9)-(line 191,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.removeNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n     * Removes the node from the list, storing it in the cache for reuse\n     * if the cache is not yet full.\n     *\n     * @param node  the node to remove\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 31)",
        "(line 203,col 9)-(line 203,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.removeAllNodes()",
      "begin_line": 211,
      "end_line": 225,
      "comment": "\n     * Removes all the nodes from the list, storing as many as required in the\n     * cache for reuse.\n     *\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 86)",
        "(line 218,col 9)-(line 218,col 35)",
        "(line 219,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "\n     * Serializes the data held in this object to the stream specified.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 33)",
        "(line 233,col 9)-(line 233,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.NodeCachingLinkedList.readObject(java.io.ObjectInputStream)",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * Deserializes the data held in this object to the stream specified.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 31)",
        "(line 241,col 9)-(line 241,col 25)"
      ]
    }
  ]
}