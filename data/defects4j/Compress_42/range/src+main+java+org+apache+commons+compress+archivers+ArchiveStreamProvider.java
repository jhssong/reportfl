{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamProvider",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 104,
      "comment": "\n * Creates Archive {@link ArchiveInputStream}s and {@link ArchiveOutputStream}s.\n * \n * @since 1.13\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamProvider.createArchiveInputStream(java.lang.String, java.io.InputStream, java.lang.String)",
      "begin_line": 60,
      "end_line": 61,
      "comment": "\n     * Creates an archive input stream from an archiver name and an input\n     * stream.\n     * \n     * @param name\n     *            the archive name, i.e.\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#AR},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ARJ},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#CPIO},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#DUMP}\n     *            or\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#SEVEN_Z}\n     * @param in\n     *            the input stream\n     * @param encoding\n     *            encoding name or null for the default\n     * @return the archive input stream\n     * @throws ArchiveException\n     *             if the archiver name is not known\n     * @throws StreamingNotSupportedException\n     *             if the format cannot be read from a stream\n     * @throws IllegalArgumentException\n     *             if the archiver name or stream is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamProvider.createArchiveOutputStream(java.lang.String, java.io.OutputStream, java.lang.String)",
      "begin_line": 87,
      "end_line": 88,
      "comment": "\n     * Creates an archive output stream from an archiver name and an output\n     * stream.\n     * \n     * @param name\n     *            the archive name, i.e.\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#AR},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR}\n     *            or\n     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#CPIO}\n     * @param out\n     *            the output stream\n     * @param encoding\n     *            encoding name or null for the default\n     * @return the archive output stream\n     * @throws ArchiveException\n     *             if the archiver name is not known\n     * @throws StreamingNotSupportedException\n     *             if the format cannot be written to a stream\n     * @throws IllegalArgumentException\n     *             if the archiver name or stream is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamProvider.getInputStreamArchiveNames()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Gets all the input stream archive names for this provider\n     * \n     * @return all the input archive names for this provider\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamProvider.getOutputStreamArchiveNames()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Gets all the output stream archive names for this provider\n     * \n     * @return all the output archive names for this provider\n     ",
      "child_ranges": []
    }
  ]
}