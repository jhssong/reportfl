{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/PKWareExtraHeader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PKWareExtraHeader",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 64,
      "end_line": 167,
      "comment": "\n * Base class for all PKWare strong crypto extra headers.\n *\n * \u003cp\u003eThis base class acts as a marker so you know you can ignore all\n * extra fields that extend this class if you are not interested in\n * the meta data of PKWare strong encryption.\u003c/p\u003e\n *\n * \u003cb\u003eAlgorithm IDs\u003c/b\u003e - integer identifier of the encryption algorithm from\n * the following range\n *\n * \u003cul\u003e\n * \u003cli\u003e0x6601 - DES\u003c/li\u003e\n * \u003cli\u003e0x6602 - RC2 (version needed to extract \u003c 5.2)\u003c/li\u003e\n * \u003cli\u003e0x6603 - 3DES 168\u003c/li\u003e\n * \u003cli\u003e0x6609 - 3DES 112\u003c/li\u003e\n * \u003cli\u003e0x660E - AES 128\u003c/li\u003e\n * \u003cli\u003e0x660F - AES 192\u003c/li\u003e\n * \u003cli\u003e0x6610 - AES 256\u003c/li\u003e\n * \u003cli\u003e0x6702 - RC2 (version needed to extract \u003e\u003d 5.2)\u003c/li\u003e\n * \u003cli\u003e0x6720 - Blowfish\u003c/li\u003e\n * \u003cli\u003e0x6721 - Twofish\u003c/li\u003e\n * \u003cli\u003e0x6801 - RC4\u003c/li\u003e\n * \u003cli\u003e0xFFFF - Unknown algorithm\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cb\u003eHash Algorithms\u003c/b\u003e - integer identifier of the hash algorithm from the\n * following range\n *\n * \u003cul\u003e\n * \u003cli\u003e0x0000 - none\u003c/li\u003e\n * \u003cli\u003e0x0001 - CRC32\u003c/li\u003e\n * \u003cli\u003e0x8003 - MD5\u003c/li\u003e\n * \u003cli\u003e0x8004 - SHA1\u003c/li\u003e\n * \u003cli\u003e0x8007 - RIPEMD160\u003c/li\u003e\n * \u003cli\u003e0x800C - SHA256\u003c/li\u003e\n * \u003cli\u003e0x800D - SHA384\u003c/li\u003e\n * \u003cli\u003e0x800E - SHA512\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeToEnum"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.EncryptionAlgorithm(int)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n         * private constructor for enum style class.\n         ",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getCode()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n         * the algorithm id.\n         *\n         * @return the PKWare AlgorithmId\n         ",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(int)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n         * returns the EncryptionAlgorithm for the given code or null if the\n         * method is not known.\n         ",
      "child_ranges": [
        "(line 114,col 13)-(line 114,col 57)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeToEnum"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.HashAlgorithm(int)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n         * private constructor for enum style class.\n         ",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getCode()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n         * the hash algorithm ID.\n         *\n         * @return the PKWare hashAlg\n         ",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(int)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n         * returns the HashAlgorithm for the given code or null if the method is\n         * not known.\n         ",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 57)"
      ]
    }
  ]
}