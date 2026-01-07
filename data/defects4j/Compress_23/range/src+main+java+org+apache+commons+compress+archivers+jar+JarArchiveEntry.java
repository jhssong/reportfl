{
  "filepath": "/tmp/Compress-23b/src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveEntry"
      ],
      "begin_line": 33,
      "end_line": 90,
      "comment": "\n *\n * @NotThreadSafe (parent is not thread-safe)\n "
    },
    {
      "type": "field",
      "varNames": [
        "manifestAttributes"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " These are always null - see https://issues.apache.org/jira/browse/COMPRESS-18 for discussion"
    },
    {
      "type": "field",
      "varNames": [
        "certificates"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveEntry.JarArchiveEntry(java.util.zip.ZipEntry)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveEntry.JarArchiveEntry(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveEntry.JarArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveEntry.JarArchiveEntry(java.util.jar.JarEntry)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveEntry.getManifestAttributes()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * This method is not implemented and won\u0027t ever be.\n     * The JVM equivalent has a different name {@link java.util.jar.JarEntry#getAttributes()}\n     *\n     * @deprecated since 1.5, do not use; always returns null\n     * @return Always returns null.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveEntry.getCertificates()",
      "begin_line": 75,
      "end_line": 88,
      "comment": "\n     * Return a copy of the list of certificates or null if there are none.\n     *\n     * @return Always returns null in the current implementation\n     *\n     * @deprecated since 1.5, not currently implemented\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 81,col 9)",
        "(line 87,col 9)-(line 87,col 20)"
      ]
    }
  ]
}