{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"
      ],
      "begin_line": 33,
      "end_line": 78,
      "comment": "\n * Implements an input stream that can read entries from jar files.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.JarArchiveInputStream(java.io.InputStream)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Creates an instance from the input stream using the default encoding.\n     * \n     * @param inputStream the input stream to wrap\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.JarArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Creates an instance from the input stream using the specified encoding.\n     * \n     * @param inputStream the input stream to wrap\n     * @param encoding the encoding to use\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.getNextJarEntry()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 56)",
        "(line 57,col 9)-(line 57,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.getNextEntry()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byte[], int)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Checks if the signature matches what is expected for a jar file\n     * (in this case it is the same as for a zip file).\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a jar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 64)"
      ]
    }
  ]
}