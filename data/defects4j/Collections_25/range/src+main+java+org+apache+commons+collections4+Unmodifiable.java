{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/Unmodifiable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Unmodifiable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n * Marker interface for collections, maps and iterators that are unmodifiable.\n * \u003cp\u003e\n * This interface enables testing such as:\n * \u003cpre\u003e\n * if (coll instanceof Unmodifiable) {\n *   coll \u003d new ArrayList(coll);\n * }\n * // now we know coll is modifiable\n * \u003c/pre\u003e\n * Of course all this only works if you use the Unmodifiable classes defined\n * in this library. If you use the JDK unmodifiable class via {@code java.util Collections}\n * then the interface won\u0027t be there.\n *\n * @since 3.0\n * @version $Id$\n "
    }
  ]
}