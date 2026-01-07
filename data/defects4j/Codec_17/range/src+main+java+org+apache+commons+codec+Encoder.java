{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/Encoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Encoder",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 43,
      "comment": "\n * Provides the highest level of abstraction for Encoders.\n * \u003cp\u003e\n * This is the sister interface of {@link Decoder}.  Every implementation of Encoder provides this\n * common generic interface which allows a user to pass a generic Object to any Encoder implementation\n * in the codec package.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.Encoder.encode(java.lang.Object)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Encodes an \"Object\" and returns the encoded content as an Object. The Objects here may just be\n     * \u003ccode\u003ebyte[]\u003c/code\u003e or \u003ccode\u003eString\u003c/code\u003es depending on the implementation used.\n     *\n     * @param source\n     *            An object to encode\n     * @return An \"encoded\" Object\n     * @throws EncoderException\n     *             An encoder exception is thrown if the encoder experiences a failure condition during the encoding\n     *             process.\n     ",
      "child_ranges": []
    }
  ]
}