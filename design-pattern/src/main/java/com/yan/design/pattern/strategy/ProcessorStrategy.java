package com.yan.design.pattern.strategy;

import lombok.Data;

/**
 * @author yanyuyao
 */
@Data
public class ProcessorStrategy {

    private Processor processor;

    public ProcessorStrategy(Processor processor) {
        this.processor = processor;
    }

    public void execute() {
        processor.process();
    }
}
