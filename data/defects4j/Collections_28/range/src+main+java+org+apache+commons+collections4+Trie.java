{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/Trie.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Trie",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.IterableSortedMap\u003cK, V\u003e"
      ],
      "begin_line": 28,
      "end_line": 47,
      "comment": "\n * Defines the interface for a prefix tree, an ordered tree data structure. For\n * more information, see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Trie\"\u003eTries\u003c/a\u003e.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Trie.prefixMap(K)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns a view of this {@link Trie} of all elements that are prefixed\n     * by the given key.\n     * \u003cp\u003e\n     * In a {@link Trie} with fixed size keys, this is essentially a\n     * {@link #get(Object)} operation.\n     * \u003cp\u003e\n     * For example, if the {@link Trie} contains \u0027Anna\u0027, \u0027Anael\u0027,\n     * \u0027Analu\u0027, \u0027Andreas\u0027, \u0027Andrea\u0027, \u0027Andres\u0027, and \u0027Anatole\u0027, then\n     * a lookup of \u0027And\u0027 would return \u0027Andreas\u0027, \u0027Andrea\u0027, and \u0027Andres\u0027.\n     *\n     * @param key  the key used in the search\n     * @return a {@link SortedMap} view of this {@link Trie} with all elements whose\n     *   key is prefixed by the search key\n     ",
      "child_ranges": []
    }
  ]
}