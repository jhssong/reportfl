{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/ArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 39,
      "end_line": 48,
      "comment": "\n * Archive input streams are expected to override the\u003cbr/\u003e\n * {@link #read()} and {@link #read(byte[] b, int off, int len)} \u003cbr/\u003e\n * methods so that reading from the stream generates EOF for the end of\n * data in each entry as well as at the end of the file proper. The\n * {@link #getNextEntry()} method is used to reset the input stream\n * ready for reading the data from the next entry.\n * \u003cp\u003e\n * The input stream classes must also implement a method with the signature:\n * \u003cpre\u003e\n * public static boolean matches(byte[] signature, int length)\n * \u003c/pre\u003e\n * which is used by the {@link ArchiveStreamFactory} to autodetect\n * the archive type from the first few bytes of a stream. \n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.getNextEntry()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Returns the next Archive Entry in this Stream.\n     * @return the next entry\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": []
    }
  ]
}