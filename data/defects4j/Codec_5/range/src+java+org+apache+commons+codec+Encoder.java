{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/Encoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Encoder",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 45,
      "comment": "\n * \u003cp\u003eProvides the highest level of abstraction for Encoders.\n * This is the sister interface of {@link Decoder}.  Every implementation of\n * Encoder provides this common generic interface whic allows a user to pass a \n * generic Object to any Encoder implementation in the codec package.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.Encoder.encode(java.lang.Object)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Encodes an \"Object\" and returns the encoded content \n     * as an Object.  The Objects here may just be \u003ccode\u003ebyte[]\u003c/code\u003e\n     * or \u003ccode\u003eString\u003c/code\u003es depending on the implementation used.\n     *   \n     * @param pObject An object ot encode\n     * \n     * @return An \"encoded\" Object\n     * \n     * @throws EncoderException an encoder exception is\n     *  thrown if the encoder experiences a failure\n     *  condition during the encoding process.\n     ",
      "child_ranges": []
    }
  ]
}