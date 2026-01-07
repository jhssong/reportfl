{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/Put.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Put",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 55,
      "comment": "\n * The \"write\" subset of the {@link Map} interface.\n * \u003cp\u003e\n * NOTE: in the original {@link Map} interface, {@link Map#put(Object, Object)} is known\n * to have the same return type as {@link Map#get(Object)}, namely {@code V}. {@link Put}\n * makes no assumptions in this regard (there is no association with, nor even knowledge\n * of, a \"reading\" interface) and thus defines {@link #put(Object, Object)} as returning\n * {@link Object}.\n *\n * @since 4.0\n * @version $Id$\n *\n * @see Get\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Put.clear()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * @see Map#clear()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Put.put(K, V)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Note that the return type is Object, rather than V as in the Map interface.\n     * See the class Javadoc for further info.\n     *\n     * @see Map#put(Object, Object)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Put.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * @see Map#putAll(Map)\n     ",
      "child_ranges": []
    }
  ]
}