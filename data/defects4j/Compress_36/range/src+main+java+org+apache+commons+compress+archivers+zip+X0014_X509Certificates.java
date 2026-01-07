{
  "filepath": "/tmp/Compress-36b/src/main/java/org/apache/commons/compress/archivers/zip/X0014_X509Certificates.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0014_X509Certificates",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader"
      ],
      "begin_line": 43,
      "end_line": 49,
      "comment": "\n * PKCS#7 Store for X.509 Certificates (0x0014).\n *\n * \u003cp\u003eThis field MUST contain information about each of the certificates files may\n * be signed with. When the Central Directory Encryption feature is enabled for\n * a ZIP file, this record will appear in the Archive Extra Data Record,\n * otherwise it will appear in the first central directory record and will be\n * ignored in any other record.\u003c/p\u003e\n *\n * \u003cp\u003eNote: all fields stored in Intel low-byte/high-byte order.\u003c/p\u003e\n *\n * \u003cpre\u003e\n *         Value     Size     Description\n *         -----     ----     -----------\n * (Store) 0x0014    2 bytes  Tag for this \"extra\" block type\n *         TSize     2 bytes  Size of the store data\n *         TData     TSize    Data about the store\n * \u003c/pre\u003e\n *\n * @NotThreadSafe\n * @since 1.11\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.X0014_X509Certificates()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 36)"
      ]
    }
  ]
}