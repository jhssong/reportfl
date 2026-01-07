{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/archivers/zip/ZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipEncoding",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 84,
      "comment": "\n * An interface for encoders that do a pretty encoding of ZIP\n * filenames.\n *\n * \u003cp\u003eThere are mostly two implementations, one that uses java.nio\n * {@link java.nio.charset.Charset Charset} and one implementation,\n * which copes with simple 8 bit charsets, because java-1.4 did not\n * support Cp437 in java.nio.\u003c/p\u003e\n * \n * \u003cp\u003eThe main reason for defining an own encoding layer comes from\n * the problems with {@link java.lang.String#getBytes(String)\n * String.getBytes}, which encodes unknown characters as ASCII\n * quotation marks (\u0027?\u0027). Quotation marks are per definition an\n * invalid filename on some operating systems  like Windows, which\n * leads to ignored ZIP entries.\u003c/p\u003e\n * \n * \u003cp\u003eAll implementations should implement this interface in a\n * reentrant way.\u003c/p\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncoding.canEncode(java.lang.String)",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Check, whether the given string may be losslessly encoded using this\n     * encoding.\n     * \n     * @param name A filename or ZIP comment.\n     * @return Whether the given name may be encoded with out any losses.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncoding.encode(java.lang.String)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Encode a filename or a comment to a byte array suitable for\n     * storing it to a serialized zip entry.\n     * \n     * \u003cp\u003eExamples for CP 437 (in pseudo-notation, right hand side is\n     * C-style notation):\u003c/p\u003e\n     * \u003cpre\u003e\n     *  encode(\"\\u20AC_for_Dollar.txt\") \u003d \"%U20AC_for_Dollar.txt\"\n     *  encode(\"\\u00D6lf\\u00E4sser.txt\") \u003d \"\\231lf\\204sser.txt\"\n     * \u003c/pre\u003e\n     * \n     * @param name A filename or ZIP comment. \n     * @return A byte buffer with a backing array containing the\n     *         encoded name.  Unmappable characters or malformed\n     *         character sequences are mapped to a sequence of utf-16\n     *         words encoded in the format \u003ccode\u003e%Uxxxx\u003c/code\u003e.  It is\n     *         assumed, that the byte buffer is positioned at the\n     *         beginning of the encoded result, the byte buffer has a\n     *         backing array and the limit of the byte buffer points\n     *         to the end of the encoded result.\n     * @throws IOException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncoding.decode(byte[])",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * @param data The byte values to decode.\n     * @return The decoded string.\n     * @throws IOException on error\n     ",
      "child_ranges": []
    }
  ]
}