{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/Decoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Decoder",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 46,
      "comment": "\n * Provides the highest level of abstraction for Decoders.\n * \u003cp\u003e\n * This is the sister interface of {@link Encoder}. All Decoders implement this common generic interface.\n * Allows a user to pass a generic Object to any Decoder implementation in the codec package.\n * \u003cp\u003e\n * One of the two interfaces at the center of the codec package.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.Decoder.decode(java.lang.Object)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Decodes an \"encoded\" Object and returns a \"decoded\" Object. Note that the implementation of this interface will\n     * try to cast the Object parameter to the specific type expected by a particular Decoder implementation. If a\n     * {@link ClassCastException} occurs this decode method will throw a DecoderException.\n     *\n     * @param source\n     *            the object to decode\n     * @return a \u0027decoded\" object\n     * @throws DecoderException\n     *             a decoder exception can be thrown for any number of reasons. Some good candidates are that the\n     *             parameter passed to this method is null, a param cannot be cast to the appropriate type for a\n     *             specific encoder.\n     ",
      "child_ranges": []
    }
  ]
}