{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Coders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODER_MAP"
      ],
      "begin_line": 47,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.findByMethod(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 70,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 84)",
        "(line 73,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, java.lang.Object)",
      "begin_line": 80,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 44)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 89,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 90,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LZMADecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 101,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 102,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 105,col 13)-(line 105,col 49)",
        "(line 106,col 13)-(line 106,col 48)",
        "(line 107,col 13)-(line 109,col 13)",
        "(line 110,col 13)-(line 112,col 13)",
        "(line 113,col 13)-(line 113,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BCJDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 117,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "opts"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.BCJDecoder(org.tukaani.xz.FilterOptions)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 123,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 133,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 135,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 107)",
        "(line 138,col 13)-(line 142,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.Anonymous-07a1011b-ceb9-4a8c-bcba-e38c5ae68000.flush()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 146,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoder()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 151,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 155,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 157,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 58)",
        "(line 160,col 13)-(line 160,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BZIP2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 164,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.BZIP2Decoder()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 169,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 174,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 102)",
        "(line 178,col 13)-(line 178,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyByteAddingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 188,
      "end_line": 215,
      "comment": "\n     * ZLIB requires an extra dummy byte.\n     *\n     * @see java.util.zip.Inflater#Inflater(boolean)\n     * @see org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.DummyByteAddingInputStream(java.io.InputStream)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read()",
      "begin_line": 195,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 38)",
        "(line 198,col 13)-(line 201,col 13)",
        "(line 202,col 13)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read(byte[], int, int)",
      "begin_line": 205,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 49)",
        "(line 208,col 13)-(line 212,col 13)",
        "(line 213,col 13)-(line 213,col 26)"
      ]
    }
  ]
}