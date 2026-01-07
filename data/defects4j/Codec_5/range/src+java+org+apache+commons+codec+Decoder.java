{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/Decoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Decoder",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 54,
      "comment": "\n * \u003cp\u003eProvides the highest level of abstraction for Decoders.\n * This is the sister interface of {@link Encoder}.  All\n * Decoders implement this common generic interface.\u003c/p\u003e\n * \n * \u003cp\u003eAllows a user to pass a generic Object to any Decoder \n * implementation in the codec package.\u003c/p\u003e\n * \n * \u003cp\u003eOne of the two interfaces at the center of the codec package.\u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.Decoder.decode(java.lang.Object)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Decodes an \"encoded\" Object and returns a \"decoded\"\n     * Object.  Note that the implementation of this\n     * interface will try to cast the Object parameter\n     * to the specific type expected by a particular Decoder\n     * implementation.  If a {@link ClassCastException} occurs\n     * this decode method will throw a DecoderException.\n     * \n     * @param pObject an object to \"decode\"\n     * \n     * @return a \u0027decoded\" object\n     * \n     * @throws DecoderException a decoder exception can\n     * be thrown for any number of reasons.  Some good\n     * candidates are that the parameter passed to this\n     * method is null, a param cannot be cast to the\n     * appropriate type for a specific encoder.\n     ",
      "child_ranges": []
    }
  ]
}