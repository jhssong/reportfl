{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/TrieUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TrieUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 49,
      "comment": "\n * A collection of {@link Trie} utilities.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.TrieUtils.TrieUtils()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * {@link TrieUtils} should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.TrieUtils.unmodifiableTrie(org.apache.commons.collections4.Trie\u003cK, ? extends V\u003e)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Returns an unmodifiable instance of a {@link Trie}\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param trie  the trie to make unmodifiable, must not be null\n     * @return an unmodifiable trie backed by the given trie\n     * @throws NullPointerException if trie is null\n     *\n     * @see java.util.Collections#unmodifiableMap(java.util.Map)\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 55)"
      ]
    }
  ]
}