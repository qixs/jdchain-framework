package com.jd.blockchain.ledger;

import com.jd.blockchain.crypto.HashDigest;
import com.jd.blockchain.utils.Bytes;

public interface MerkleDataNode extends MerkleNode {

	Bytes getKey();

	long getVersion();
	
	HashDigest getValueHash();

}