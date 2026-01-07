{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Coders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODER_MAP"
      ],
      "begin_line": 45,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.findByMethod(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 68,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 90)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, java.lang.Object)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 88,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 89,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BCJDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 100,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "opts"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.BCJDecoder(org.tukaani.xz.FilterOptions)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 106,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 116,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 115)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 126,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoder()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 131,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 57)",
        "(line 136,col 13)-(line 137,col 30)",
        "(line 138,col 13)-(line 162,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-2e0f39f6-0b1f-41fd-a1df-9163c40eb209.read()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 21)-(line 141,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-0bd1d7ff-9997-451f-be85-1b6e4b1dffae.read(byte[], int, int)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 21)-(line 146,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-38c22eb3-309a-4417-8f66-3362dc71a6ac.read(byte[])",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 21)-(line 151,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-912d02ca-bf7a-4175-8e7e-d7ed56c357aa.close()",
      "begin_line": 154,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 156,col 21)-(line 160,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 164,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 64)",
        "(line 167,col 13)-(line 167,col 64)",
        "(line 168,col 13)-(line 168,col 102)",
        "(line 169,col 13)-(line 193,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-343a746e-c3f9-42fb-a00f-3a9a1e6fb5f3.write(int)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 21)-(line 172,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-4862f27a-c4ee-4bb6-b5ab-89aa0e691b8c.write(byte[])",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 21)-(line 177,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-0c140987-fcbf-465d-92ab-9ca46a9e45f9.write(byte[], int, int)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 21)-(line 182,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-a181a864-a669-4f31-9128-7a3ed8dd9cca.close()",
      "begin_line": 185,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 187,col 21)-(line 191,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BZIP2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 197,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.BZIP2Decoder()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 202,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 208,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 108)",
        "(line 212,col 13)-(line 212,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyByteAddingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 222,
      "end_line": 249,
      "comment": "\n     * ZLIB requires an extra dummy byte.\n     *\n     * @see java.util.zip.Inflater#Inflater(boolean)\n     * @see org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.DummyByteAddingInputStream(java.io.InputStream)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read()",
      "begin_line": 229,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 38)",
        "(line 232,col 13)-(line 235,col 13)",
        "(line 236,col 13)-(line 236,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read(byte[], int, int)",
      "begin_line": 239,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 55)",
        "(line 242,col 13)-(line 246,col 13)",
        "(line 247,col 13)-(line 247,col 26)"
      ]
    }
  ]
}